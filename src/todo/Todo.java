package todo;
public class Todo {
    final int id;
    final String task;
    final String desc;
    final String timestamp;
    protected boolean isCompleted;

    public Todo( int id, String task, String desc, String timestamp, String deadline, boolean isCompleted ) {
        this.id = id; this.task = task; this.desc = desc; this.timestamp = timestamp; this.isCompleted = isCompleted;
    }
    
    public Todo( int id, String task, String timestamp, String deadline, boolean isCompleted ) {
        this.id = id; this.task = task; this.desc = ""; this.timestamp = timestamp; this.isCompleted = isCompleted;
    }
    
    public boolean isCompleted() { return isCompleted; }
    
    public void setCompleted( boolean completed ) { isCompleted = completed; }
    
    protected String CreateSeparator() {
        String separator = "-----------------------";
        String line = "-".repeat( 350 );
        return String.format( "<td>%s</td><td>%s</td>", separator, line );
    }
    
    protected String getString( String status ) {
        String descRow = desc.isEmpty() ? "" : String.format( "<tr><td style='width:50px;'>Description</td><td style='width:750px;'>: %s</td></tr>", desc );
        
        return String.format(
            "<tr>" + "<td style='width:50px;'>ID</td><td style='width:750px;'><i>: %d</i></td>" + "</tr>" +
            "<tr>" + "<td style='width:50px;'>Task</td><td style='width:750px;'><b>: %s</b></td>" + "</tr>" + "%s" +
            "<tr>" + "<td style='width:50px;'>Timestamp</td><td style='width:750px;'>: %s</td>" + "</tr>" +
            "<tr>" + "<td style='width:50px;'><p>Status</p></td><td style='width:750px;'>: %s</td>" + "</tr>",
            id, task, descRow, timestamp, status );
    }
    
    public String toString() {
        String status = isCompleted ? "[ Completed ]" : "<span style='color:#ff0000;'>[ Pending ]</span>";
        String separatorRow = CreateSeparator();
        String listRow = getString( status );
    
        return String.format(
            "<html>" + "<div style='width:100%%; padding: 5px; padding-left: 5px'>" +
            "<table border='0' cellspacing='0' cellpadding='2' style='width:800;'>" +
                "%s" + "%s" + "%s" +
            "</table>" + "</div>" + "</html>", separatorRow, listRow, separatorRow );
    }
}