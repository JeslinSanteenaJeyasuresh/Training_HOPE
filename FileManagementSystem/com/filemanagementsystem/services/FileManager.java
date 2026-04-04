package com.filemanagementsystem.services;

import com.filemanagementsystem.model.*;
import com.filemanagementsystem.system.FileSystem;

public class FileManager {
    private FileSystem fileSystem;

    public FileManager(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }

    public void createFile(String name, int size, String type, Directory dir) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid file name");
        }
        dir.AddEntity(new File(name, size, type));
    }

    public void createDirectory(String name, Directory parent) {
        parent.AddEntity(new Directory(name));
    }

    public void delete(String name, Directory dir) {
        dir.RemoveEntity(name);
    }

    public FileSystemEntity search(String name, Directory dir) {
        return dir.search(name);
    }
}