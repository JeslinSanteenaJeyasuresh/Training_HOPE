package com.filemanagementsystem.system;
import com.filemanagementsystem.model.Directory;

//FileSystem class represents the overall file management system.

//This class is like the "main container" that holds all files and directories.

public class FileSystem {

    // Root directory of the file system (top-most folder)
    private Directory root;

    // Constructor initializes the file system with a default root directory
    public FileSystem() {
        root = new Directory("Root"); // Creating the root folder
    }

    // Getter method to access the root directory
    public Directory getRoot() {
        return root;
    }

    // Displays the entire file system structure starting from root
    public void displaySystem() {
        // Calling display method of root with empty indent (top level)
        root.Display("");
    }
}