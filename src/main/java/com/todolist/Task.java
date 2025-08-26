package com.todolist;

/**
 * This class represents a simple to-do list which defines the description of the task and whether or not it has been completed
 * 
 */
public class Task {
    private String description;
    private boolean isCompleted;

    /**
     * Constructs a new task with a brief description of what the task is 
     * The task is also marked as not completed once it is added
     * @param description The text describing the task
     */
    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    /**
     * Retrieves the description of a task
     * @return The description of the class
     */
    public String getDescription(){
        return description;
    }

    /**
     * Retrieves whether or not the task has been completed
     * @return True if the task has been completed and false if it has not been completed
     */
    public boolean isCompleted(){
        return isCompleted;
    }
    /**
     * Marks the task as completed
     */
    public void taskCompleted(){
        isCompleted = true;
    }

    /**
     * Returns a string representation of the task by showing its completion status and the descirption of it.
     * @return A formatted string to display
     */
    @Override
    public String toString(){
        return (isCompleted ? "[ X ]" : "[ ]") + description;
    }
}
