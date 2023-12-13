package main;
import todo.TodoAppGUI;
import javax.swing.*;

public class TodoApp {
    public static void main( String[] args ) { SwingUtilities.invokeLater( TodoAppGUI ::createAndShowGUI ); }
}