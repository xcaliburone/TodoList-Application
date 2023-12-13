package todo;

public class SubTodo extends Todo {
    public final String deadline;
    
    public SubTodo(int id, String task, String desc, String timestamp, String deadline, boolean isCompleted) {
        super(id, task, desc, timestamp, deadline, isCompleted);
        this.deadline = deadline;
    }
    
    public SubTodo(int id, String task, String timestamp, String deadline, boolean isCompleted) {
        super(id, task, timestamp, deadline, isCompleted);
        this.deadline = deadline;
    }
    
    @Override
    protected String getString(String status) {
        String descRow = desc.isEmpty() ? "" : String.format("<tr><td style='width:50px;'>Description</td><td style='width:750px;'>: %s</td></tr>", desc);
        
        String deadlineRow = deadline.isEmpty() ? "" : String.format("<tr><td style='width:50px;'>Deadline</td><td style='width:750px;'>: %s</td></tr>", deadline);
        
        return String.format(
            "<tr>" + "<td style='width:50px;'>ID</td><td style='width:750px;'><i>: %d</i></td>" + "</tr>" +
            "<tr>" + "<td style='width:50px;'>Task</td><td style='width:750px;'><b>: %s</b></td>" + "</tr>" + "%s" +
            "<tr>" + "<td style='width:50px;'>Timestamp</td><td style='width:750px;'>: %s</td>" + "</tr>" + "%s" +
            "<tr>" + "<td style='width:50px;'><p>Status</p></td><td style='width:750px;'>: %s</td>" + "</tr>",
            id, task, descRow, timestamp, deadlineRow, status);
    }
    
    @Override
    public String toString() {
        String status = isCompleted ? "[ Completed ]" : "<span style='color:#ff0000;'>[ Pending ]</span>";
        String separatorRow = CreateSeparator();
        String listRow = getString(status);
        
        return String.format(
            "<html>" + "<div style='width:100%%; padding: 5px; padding-left: 5px'>" +
            "<table border='0' cellspacing='0' cellpadding='2' style='width:800;'>" +
            "%s" + "%s" + "%s" +
            "</table>" + "</div>" + "</html>", separatorRow, listRow, separatorRow);
    }
}