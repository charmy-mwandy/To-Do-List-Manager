package com.systemdesign;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.text.SimpleDateFormat;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ToDoList todoList = new ToDoList();
        Calendar calendar = new Calendar();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Add tasks
        todoList.addToItems("Task 1", "Description 1");
        todoList.addToItems("Task 2", "Description 2");
        todoList.addToItems("Task 3", "Description 3");

        // Adding tasks to the calendar
        ToDoItem task1 = new ToDoItem("Important Task", "This task has a deadline");
        ToDoItem task2 = new ToDoItem("Meeting", "Team meeting at 3 PM");

        calendar.addTaskToDay("2023-09-20", task1);
        calendar.addTaskToDay("2023-09-21", task2);

        // Printing all added items in the to-do list
        List<ToDoItem> todoItems = todoList.getTodoItems();
        for (int i = 0; i < todoItems.size(); i++) {
            System.out.println("Task " + (i + 1) + ": " + todoItems.get(i));
        }

        // Edit a task
        todoList.editToDoItem(1, "Updated Task 2", "Updated Description 2");

        // Deleting a task from the to-do list
        todoList.deleteToDoItem(1);

        // Mark a task as complete
        todoList.markToDoItemAsComplete(0);

        // Sorting tasks by completion status and title
        Collections.sort(todoItems, Comparator.comparing(ToDoItem::isCompleted).thenComparing(ToDoItem::getTitle));

        // Viewing tasks on the calendar
        String date = "2023-09-20";
        List<ToDoItem> tasksForDay = calendar.getTasksForDay(date);
        System.out.println("\nTasks for " + date + ":");
        for (ToDoItem task : tasksForDay) {
            System.out.println(task);
        }

        // Removing a task from the calendar
        calendar.removeTaskFromDay(date, task1);


    }

}
