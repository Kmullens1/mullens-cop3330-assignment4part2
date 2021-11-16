/*
 * UCF COP3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Keri Mullens
 */
package ucf.assignments;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class TodoListController {
    @FXML
    private DatePicker chooseDueDate;

    @FXML
    private TextField taskTextBox;

    @FXML
    private TableView<String> entireTodoList;

    @FXML
    private TextField fileLocation;

    //ObservableList
    @FXML
    public void saveButtonPressed(ActionEvent actionEvent) {
        //option to name file?
        //send data to save location


    }

    private void saveToList(){

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
        //FIXME - AddTask needs to modify the Task Object (Which is an array of object task)
        // we need to add it to a global list (this acts as a storage device)
        // i.e ObservableList<>
        // add_new_data(data);

        // Once input is saved, reset date and description boxes to empty


        //TableColumn<task, String> idColumn = new TableColumn<Integer, String>("ID");
        //entireTodoList.getColumns().add(0, task);

        fileLocation.setText(taskTextBox.getText() + chooseDueDate.getValue().getMonthValue() + "/"
                + chooseDueDate.getValue().getDayOfMonth() + "/" + chooseDueDate.getValue().getYear());
        taskTextBox.clear();
        chooseDueDate.setValue(null);


    }

    @FXML
    public void deleteTaskButtonPressed(ActionEvent actionEvent) {
        //FIXME - needs to modify the task object and remove value from observable list
        //ask which row to delete?
            //OR delete row that is selected...
        //select that row and eliminate it
            //Make sure incomplete and complete lists are also updated
    }

    @FXML
    public void createListButtonPressed(ActionEvent actionEvent) {
        //old list is reset to blank


    }


    @FXML
    public void helpButtonPressed(ActionEvent actionEvent) throws IOException {
        //pop up window - new .fxml file
        //dedication to Rey
        Parent part = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Help Payne.fxml")));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

}









