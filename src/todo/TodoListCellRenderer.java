package todo;
import javax.swing.*;
import java.awt.*;

public class TodoListCellRenderer extends DefaultListCellRenderer {
    @Override
    public Component getListCellRendererComponent( JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus ) {
        super.getListCellRendererComponent( list, value, index, isSelected, cellHasFocus );
        if ( value instanceof Todo todo ) {
            Color bgColor = todo.isCompleted() ? new Color( 105, 246, 181 ) : new Color( 195, 195, 195 );
            setBackground( bgColor );
        } return this;
    }
}