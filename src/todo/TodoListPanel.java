package todo;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import java.util.Properties;

public class TodoListPanel extends JPanel {
    private final JList< Todo > todoJList;
    private final DefaultListModel< Todo > listModel;

    public TodoListPanel() {
        setLayout( new BorderLayout() );
        listModel = new DefaultListModel<>();
        todoJList = new JList<>( listModel );
        todoJList.setBackground( new Color( 128, 128, 128 ) );
        todoJList.setCellRenderer( new TodoListCellRenderer() );
        JScrollPane scrollPane = new JScrollPane( todoJList );
        add( scrollPane, BorderLayout.CENTER );
    }

    public void addTodo() {
        JTextField taskField = new JTextField();
        JTextField descField = new JTextField();
        JPanel panel = new JPanel( new GridLayout( 0, 1 ) );
        panel.add( new JLabel( "Enter Todo Task:" ) );
        panel.add( taskField );
        panel.add( new JLabel( "Enter Todo Description:" ) );
        panel.add( descField );

        UtilDateModel model = new UtilDateModel();
        Properties properties = new Properties();
        JDatePanelImpl datePanel = new JDatePanelImpl( model, properties );

        JDatePickerImpl datePicker = new JDatePickerImpl( datePanel, new TodoDateLabel() );
        panel.add(new JLabel( "Select Deadline:") );
        panel.add( datePicker );

        int result = JOptionPane.showConfirmDialog( null, panel, "Add Todo", JOptionPane.OK_CANCEL_OPTION );
        if ( result == JOptionPane.OK_OPTION ) {
            String task = taskField.getText();
            if ( task.isEmpty() ) { showWarning( "Task title is required. Please enter a title for the task." ); return; }
            String desc = descField.getText();

            String timestamp = new SimpleDateFormat( "dd-MM-yyyy HH:mm" ).format( new Date() );
            Date selectedDate = ( Date ) datePicker.getModel().getValue();
            if (selectedDate != null && selectedDate.before(new Date())) {
                showWarning("Invalid Deadline. Please select a future date.");
                return;
            }

            String deadline = "";
            if (selectedDate != null) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                deadline = dateFormat.format( selectedDate );
            }

            Todo SubTodo;
            if ( desc.isEmpty() ) {
                SubTodo = new SubTodo( generateId(), task, "", timestamp, deadline, false );
            } else {
                SubTodo = new SubTodo( generateId(), task, desc, timestamp, deadline, false );
            }
            listModel.addElement( SubTodo );
        }
    }

    public void markTodoAsComplete() {
        Todo selectedTodo = todoJList.getSelectedValue();
        if ( selectedTodo != null ) {
            selectedTodo.setCompleted( true );
            listModel.setElementAt( selectedTodo, todoJList.getSelectedIndex() );
        } else { showWarning( "Please select a todoma.Todo item to mark as complete." ); }
    }

    public void markUncompleteButton() {
        Todo selectedTodo = todoJList.getSelectedValue();
        if ( selectedTodo != null ) {
            if ( selectedTodo.isCompleted() ) {
                selectedTodo.setCompleted( false );
                listModel.setElementAt( selectedTodo, todoJList.getSelectedIndex() );
            } else { showWarning( "You can only do this on completed tasks." ); }
        } else { showWarning( "Please select a completed task to change its status." ); }
    }

    public void removeCompletedTodo() {
        int response = confirmDeletion( "Are you sure you want to remove completed tasks?" );
        if ( response == JOptionPane.YES_OPTION ) { int confirmation = confirmDeletion( "This action cannot be undone. Are you sure?" );
            if ( confirmation == JOptionPane.YES_OPTION ) { removeCompletedTasks(); }
        }
    }

    private void removeCompletedTasks() {
        for ( int i = listModel.size() - 1; i >= 0; i-- ) { Todo todo = listModel.getElementAt( i );
            if ( todo.isCompleted() ) { listModel.removeElementAt( i ); }
        }
    }

    public void removeAllTodo() {
        int response = confirmDeletion( "Are you sure you want to remove all tasks?" );
        if ( response == JOptionPane.YES_OPTION ) { int confirmation = confirmDeletion( "This action cannot be undone. Are you sure?" );
            if ( confirmation == JOptionPane.YES_OPTION ) { listModel.removeAllElements(); }
        }
    }

    private int generateId() { return ( int ) System.currentTimeMillis(); }

    private void showWarning( String message ) { JOptionPane.showMessageDialog( this,message,"Warning", JOptionPane.WARNING_MESSAGE );}

    private int confirmDeletion(String message){return JOptionPane.showConfirmDialog(this,message,"Confirm Deletion",JOptionPane.YES_NO_OPTION);}
}