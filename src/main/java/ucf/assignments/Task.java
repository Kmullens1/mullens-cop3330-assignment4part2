package ucf.assignments;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class Task {

    boolean completionStatus;
    int dueDate; //fixme Should be type DatePicker - int for now so I can figure out other things
    //TextField task;
    String taskDescription; //fixme string for now so I can figure out other things


   /* private SimpleBooleanProperty done;
    private SimpleStringProperty dueDate;
    private SimpleStringProperty task;

    //FIXME - I don't think dueDate is a String
    Task(boolean done, String dueDate, String task) {
        this.done = new SimpleBooleanProperty(done);
        this.dueDate = new SimpleStringProperty(dueDate);
        this.task = new SimpleStringProperty(task);
    }
    */

}
