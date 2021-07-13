/*
 * UCF COP3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Keri Mullens
 */

package ucf.assignments;

public class TodoList {

    public static void main(String[] args) {
        //
        //	The application shall manage a single list of items
            //The list shall have the capacity to store at least 100 unique items
        //  An item shall have a description
            //A description shall be between 1 and 256 characters in length
        //An item shall have a due date.
            //A due date shall be a valid date within the Gregorian Calendar
            //A due date shall be displayed to users in the format: YYYY-MM-DD
        CreateList createList;
        createList = new CreateList();


        //  A user shall be able to add a new item to the list
        AddNewItem newItem;
        newItem = new AddNewItem();

        //  A user shall be able to remove an item from the list
        RemoveItemFromList removeItem;
        removeItem = new RemoveItemFromList();

        //  A user shall be able to clear the list of all items
        ClearEntireList clearAll;
        clearAll = new ClearEntireList();

        //  A user shall be able to edit the description of an item within the list
        EditItemDescription editDescription;
        editDescription = new EditItemDescription();

        //  A user shall be able to edit the due date of an item within the list
        EditItemDueDate editDueDate;
        editDueDate = new EditItemDueDate();

        //Might combine complete and incomplete functions
        //  A user shall be able to mark an item in the list as complete
        MarkItemComplete markComplete;
        markComplete = new MarkItemComplete();

        //  A user shall be able to mark an item in the list as incomplete
        MarkItemIncomplete markIncomplete;
        markIncomplete = new MarkItemIncomplete();

        //  A user shall be able to display all of the existing items in the list
        DisplayExistingItems displayItems;
        displayItems = new DisplayExistingItems();

        //  A user shall be able to display only the incomplete items in the list
        DisplayIncompleteItems displayIncomplete;
        displayIncomplete = new DisplayIncompleteItems();

        //  A user shall be able to display only the completed items in the list
        DisplayCompleteItems displayComplete;
        displayComplete = new DisplayCompleteItems();

        //  A user shall be able to save the list (and all of its items) to external storage
        SaveInSingleList saveSingle;
        saveSingle = new SaveInSingleList();

        //  A user shall be able to load a list (and all of its items) from external storage
        LoadSingleList loadSingle;
        loadSingle = new LoadSingleList();

        //  The developer shall provide a help screen with directions on how to use the application.
            //The help screen shall describe how to execute each behavioral requirement provided by
                    //the application (e.g. add an item, remove an item, edit an item, etc.)
            //The help screen shall include a dedication to "Rey"
            // This help screen shall be provided as either a dedicated window within the application,
                    //or a markdown file called `readme.md` on your GitHub repository for the project.)
        AccessHelpScreen helpScreen;
        helpScreen = new AccessHelpScreen();

        //Bonus: If your application allows the user to sort a todo list by due date, you will earn 1 extra
        // point for the test and 1 extra point for the implementation.
        SortListByDueDate sortByDueDate;
        sortByDueDate = new SortListByDueDate();

    }
}
