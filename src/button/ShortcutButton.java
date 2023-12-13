package button;
import javax.swing.*;
import java.awt.event.KeyEvent;
import todo.TodoListPanel;

public class ShortcutButton extends Button {
    public static JButton createAddButton( TodoListPanel todoListPanel ) {
        return createButton( "Add Todo [Alt + G]", todoListPanel, e -> todoListPanel.addTodo(), KeyEvent.VK_G );
    }
    
    public static JButton createMarkCompleteButton( TodoListPanel todoListPanel ) {
        return createButton( "Mark as Complete [Alt + C]", todoListPanel, e -> todoListPanel.markTodoAsComplete(), KeyEvent.VK_C );
    }
    
    public static JButton createMarkUncompleteButton( TodoListPanel todoListPanel ) {
        return createButton( "Mark as Uncomplete [Alt + U]", todoListPanel, e -> todoListPanel.markUncompleteButton(), KeyEvent.VK_U );
    }
    
    public static JButton createRemoveButton( TodoListPanel todoListPanel ) {
        return createButton( "Remove Completed [Alt + D]", todoListPanel, e -> todoListPanel.removeCompletedTodo(), KeyEvent.VK_D );
    }
    
    public static JButton createRemoveAllButton( TodoListPanel todoListPanel ) {
        return createButton( "Remove All Task [Alt + Z]", todoListPanel, e -> todoListPanel.removeAllTodo(), KeyEvent.VK_Z );
    }
}