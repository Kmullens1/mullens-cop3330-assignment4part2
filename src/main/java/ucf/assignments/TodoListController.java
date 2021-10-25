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
import java.net.URL;
import java.util.ResourceBundle;

public class TodoListController {
    @FXML
    private DatePicker chooseDueDate;

    @FXML
    private TextField taskDescriptionTextBox;

    @FXML
    private TableView<?> entireTodoList;

    //ObservableList
    @FXML
    public void saveButtonPressed(ActionEvent actionEvent) {
        //file chooser??? -- if so, another .fxml page is needed due to file chooser pop-up
        //option to name file?
        //send data to save location

        SaveButton save = new SaveButton();
        System.out.print("Where would you like to save your file? ");
        //FixMe - Take file location input
        String fileName = "C:\\Users\\kmull\\Desktop\\Keri's OOP Class\\SceneBuilder Stuff\\SavedTodoList";
        //FIXME - Somehow pass list data to newFile function
        save.newFile(fileName, "Hello for now");

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
        // select which data we are adding
            // ask for all the information below
            // due date, description, completion status
        // Item data = extract_data()
//FIXME - AddTask needs to modify the Task Object (Which is an array of object task)
        // we need to add it to a global list (this acts as a storage device)
        // i.e ObservableList<>
        // add_new_data(data);

        // once that is done, decide if you want to clear what the user previously entered

        // repopulate the display (kinda refresh the table)
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
        //FIXME - entire observable list is erased

    }


    @FXML
    public void helpButtonPressed(ActionEvent actionEvent) throws IOException {
        //pop up window - new .fxml file??
        //dedication to Rey
        Parent part = FXMLLoader.load(getClass().getResource("Help Payne.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    //FIXME - Not sure if I need this code or not...
    /*
    //Override????
    public void initialize(URL url, ResourceBundle rb)
    {
        TableColumn done = new TableColumn("Done:");
        TableColumn name = new TableColumn("Due Date:");
        TableColumn task = new TableColumn("Task:");

        entireTodoList.getColumns().addAll(done, name, task);
    }
     */
}









