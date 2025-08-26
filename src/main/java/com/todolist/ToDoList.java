package com.todolist;

import java.util.ArrayList;
/**
 * This class manages a collection of task objects.
 * It also allows users to add, remove, and track their to-do items.
 */
public class ToDoList {

    private ArrayList<Task> tasks;

    /**
     * Constructs a new, empty to-do list for the user.
     */
    public ToDoList(){
        this.tasks = new ArrayList<>();
    }

    /**
     * TAdds a new task to the list based on the description.
     * @param description The text describing the new task.
     */
    public void addTask(String description){

    }

    /**
     * This method marks that the task has been completed.
     * @param index The index number where the task is stored. 
     */
    public void markTaskAsComplete(int index){

    }

    /*
     * Prints all of the tasks in the lists into the console.
     * Also shows the completion status and description of said task.
     */
    public void allTasks(){

    }

    /**
     * Removes the task from the list using index.
     * @param index The index number of where the task is stored.
     */
    public void removeTask(int index){

    }

    /**
     * Prints all of the incomplete tasks into the console.
     */
    public void getIncompleteTasks(){

    }
}
