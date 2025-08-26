package com.todolist;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        ToDoList toDoList = new ToDoList();
        toDoList.addTask("Create a wooden table");
        toDoList.addTask("Create website");
        toDoList.addTask("Actually revise for once");
        //list all tasks 
        System.out.println("Added items to the to do list");
        toDoList.listAllTasks();
        //mark task at index 1 as completed and show it has been completed
        toDoList.markTaskAsComplete(1);
        System.out.println("");
        toDoList.listAllTasks();
        System.out.println("");    
        System.out.println("Marked task at index 1 as complete");
        //list all incomplete tasks
        System.out.println("");    
        toDoList.listIncompleteTasks();
        System.out.println("");    
        //remove task from the list at index 2
        toDoList.removeTask(2);       
        toDoList.listAllTasks();
    }
}
