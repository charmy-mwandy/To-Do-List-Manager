package com.systemdesign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calendar {

    private Map<String, List<ToDoItem>> tasksByDay;

    public Calendar() {
        this.tasksByDay = new HashMap<>();
    }

    public void addTaskToDay(String day, ToDoItem task){
        tasksByDay.computeIfAbsent(day, k -> new ArrayList<>()).add(task);
    }

    public  List<ToDoItem>  getTasksForDay(String day){
        return tasksByDay.getOrDefault(day, new ArrayList<>());
    }

    public  void  removeTaskFromDay(String day , ToDoItem task){
        List<ToDoItem> tasks = tasksByDay.get(day);
        if (tasks != null) {
            tasks.remove(task);
        }
    }

}
