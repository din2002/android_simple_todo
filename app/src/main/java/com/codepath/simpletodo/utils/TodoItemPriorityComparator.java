package com.codepath.simpletodo.utils;

import com.codepath.simpletodo.models.TodoItem;

import java.util.Comparator;
public class TodoItemPriorityComparator implements Comparator<TodoItem> {
    @Override
    public int compare(TodoItem one, TodoItem another) {
        return one.priority - another.priority;
    }
}
