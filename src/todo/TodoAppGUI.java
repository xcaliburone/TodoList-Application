package todo;
import javax.swing.*;
import java.awt.*;
import button.ButtonPanel;

public class TodoAppGUI {
    private JFrame frame;
    private TodoListPanel todoListPanel;
    
    public TodoAppGUI() {
        initializeFrame();
        initializeMainPanel();
        initializeButtonPanel();
        frame.setVisible( true );
    }
    
    private void initializeFrame() {
        frame = new JFrame( "Todo List Application" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setLayout( new BorderLayout() );
        frame.setLocationRelativeTo( null );
        frame.setExtendedState( JFrame.MAXIMIZED_BOTH );
    }
    
    private void initializeMainPanel() {
        JPanel mainPanel = new JPanel( new BorderLayout() );
        todoListPanel = new TodoListPanel();
        mainPanel.add( todoListPanel, BorderLayout.CENTER );
        frame.add( mainPanel );
    }
    
    private void initializeButtonPanel() {
        JPanel buttonPanel = ButtonPanel.createButtonPanel( todoListPanel );
        frame.add( buttonPanel, BorderLayout.SOUTH );
    }
    
    public static void createAndShowGUI() {
        SwingUtilities.invokeLater(() -> {
            TodoAppGUI todoAppGUI = new TodoAppGUI();
            JFrame frame = todoAppGUI.getFrame();
            frame.setVisible( true );
        });
    }
    public JFrame getFrame() { return frame; }
}