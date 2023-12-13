package todo;
import javax.swing.JFormattedTextField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TodoDateLabel extends JFormattedTextField.AbstractFormatter {
    private final String datePattern = "dd-MM-yyyy";
    private final SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);
    
    @Override
    public Object stringToValue(String text) throws ParseException { return dateFormatter.parseObject(text); }
    
    @Override
    public String valueToString(Object value) {
        if (value != null) { Calendar cal = (Calendar) value; return dateFormatter.format(cal.getTime()); }
        return "";
    }
}