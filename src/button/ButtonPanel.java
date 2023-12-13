package button;
import javax.swing.*;
import todo.TodoListPanel;

public class ButtonPanel {
    public static JPanel createButtonPanel( TodoListPanel todoListPanel ) {
        JPanel buttonPanel = new JPanel();
        
        JButton addButton = ShortcutButton.createAddButton( todoListPanel );
        buttonPanel.add( addButton );
        
        JButton markCompleteButton = ShortcutButton.createMarkCompleteButton( todoListPanel );
        buttonPanel.add( markCompleteButton );
        
        JButton markUncompleteButton = ShortcutButton.createMarkUncompleteButton( todoListPanel );
        buttonPanel.add( markUncompleteButton );
        
        JButton removeButton = ShortcutButton.createRemoveButton( todoListPanel );
        buttonPanel.add( removeButton );
        
        JButton removeAllButton = ShortcutButton.createRemoveAllButton( todoListPanel );
        buttonPanel.add( removeAllButton );
        return buttonPanel;
    }
}