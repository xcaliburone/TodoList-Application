package button;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import todo.TodoListPanel;

public class Button {
    protected static JButton createButton( String text, TodoListPanel todoListPanel, ActionListener actionListener, int mnemonicKey ) {
        JButton button = new JButton( text );
        button.addActionListener( actionListener );
        button.setMnemonic( mnemonicKey );
        button.setBackground( new Color( 105, 246, 181 ) );
        return button;
    }
}