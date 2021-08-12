/*
 * UCF COP3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Keri Mullens
 */
package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class TodoListController {
    @FXML
    private DatePicker chooseDueDate;

    @FXML
    private TextField taskDescriptionTextBox;

    @FXML
    public void saveButtonPressed(ActionEvent actionEvent) {
        //file chooser??? -- if so, another .fxml page is needed due to file chooser pop-up
        //option to name file?
        //send data to save location
    }

    @FXML
    public void loadButtonPressed(ActionEvent actionEvent) {
        //Ask name of file to load?? - I don't think there are multiple files to choose from... idk
        //access saved memory from save location
        //print saved memory
    }

    @FXML
    public void displayCompleteBoxChecked(ActionEvent actionEvent) {
        //determine if each item is complete
        //if so print item to screen
        //OR
        //Have a function that sorts actions as they are completed into a "complete list"
        //print complete list
    }

    @FXML
    public void displayIncompleteBoxChecked(ActionEvent actionEvent) {
        //determine if each item is incomplete
        //if so print item to screen
        //OR
        //Have a function that initially adds new items to another "incomplete list"
            //Once item is complete it is moved to complete list
        //print incomplete list
    }

    @FXML
    public void addTaskButtonPressed(ActionEvent actionEvent) {
        //new row is added (printed out?)
        //Ask for task description
        //Ask for due date (date picker??)
        //print description and due date
    }

    @FXML
    public void deleteTaskButtonPressed(ActionEvent actionEvent) {
        //ask which row to delete?
            //OR delete row that is selected...
        //select that row and eliminate it
            //Make sure incomplete and complete lists are also updated
    }

    @FXML
    public void createListButtonPressed(ActionEvent actionEvent) {
        //old list is reset
        //1st task and due date are requested?? or is initial new list blank?
    }

    @FXML
    public void helpButtonPressed(ActionEvent actionEvent) {
        //pop up window - new .fxml file??
        //dedication to Rey
    }
}
