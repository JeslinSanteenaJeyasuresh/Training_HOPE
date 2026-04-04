package com.filemanagementsystem.user;
import com.filemanagementsystem.services.FileManager;
public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public void performOperations(FileManager manager) {
        System.out.println(username + " is using the system...");
    }
}