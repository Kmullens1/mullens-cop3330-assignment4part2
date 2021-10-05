package ucf.assignments;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class Task {

    private SimpleBooleanProperty done;
    private SimpleStringProperty dueDate;
    private SimpleStringProperty task;

    //FIXME - I don't think dueDate is a String
    Task(boolean done, String dueDate, String task) {
        this.done = new SimpleBooleanProperty(done);
        this.dueDate = new SimpleStringProperty(dueDate);
        this.task = new SimpleStringProperty(task);
    }

}
