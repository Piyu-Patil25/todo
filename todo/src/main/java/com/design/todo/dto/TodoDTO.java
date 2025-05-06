package com.design.todo.dto;

public class TodoDTO {
    private String title;
    private Boolean completed; // use wrapper Boolean for null checks

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
