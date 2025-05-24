package com.shashank.todo_app.Repositories;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;

public class Todo {

    private int id;
    private String username;
    private String description;
    private LocalDate localDate;
    private boolean done;

    public Todo(int id, String username, String description, LocalDate localDate, boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.localDate = localDate;
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "description='" + description + '\'' +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", localDate=" + localDate +
                ", done=" + done +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public boolean isDone() {
        return done;
    }
}
