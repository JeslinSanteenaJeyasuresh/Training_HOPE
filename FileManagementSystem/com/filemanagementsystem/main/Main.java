package com.filemanagementsystem.main;
import com.filemanagementsystem.services.FileManager;
import com.filemanagementsystem.system.FileSystem;
import com.filemanagementsystem.model.*;
public class Main {
    public static void main(String[] args) {

        FileSystem fs = new FileSystem();
        FileManager manager = new FileManager(fs);

        Directory root = fs.getRoot();

        Directory docs = new Directory("Documents");
        root.AddEntity(docs);

        manager.createFile("notes.txt", 50, "txt", docs);
        manager.createFile("resume.pdf", 120, "pdf", docs);

        fs.displaySystem();
    }
}