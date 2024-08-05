package com.systemdesign;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
   private List<ToDoItem> todoItems;

    public ToDoList() {
        this.todoItems = new ArrayList<>();
    }

    public void addToItems(String title,String description){
        ToDoItem newToDoItem = new ToDoItem(title, description);
        this.todoItems.add(newToDoItem);
    }

    public void deleteToDoItem(int index) {
        if (index >= 0 && index < this.todoItems.size()) {
            this.todoItems.remove(index);
        }
    }

    public void editToDoItem(int index, String newTitle, String newDescription) {
        if (index >= 0 && index < this.todoItems.size()) {
            ToDoItem todoItem = this.todoItems.get(index);
            todoItem.setTitle(newTitle);
            todoItem.setDescription(newDescription);
        }
    }

    public void markToDoItemAsComplete(int index) {
        if (index >= 0 && index < todoItems.size()) {
            ToDoItem todoItem = todoItems.get(index);
            todoItem.setCompleted(true);
        }
    }

    public List<ToDoItem> getTodoItems() {
        return todoItems;
    }

}
