package com.filemanagementsystem.model;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemEntity {
    private List<FileSystemEntity> contents;
    public Directory(String Name){
        super(Name);
        contents=new ArrayList<>();
    }
    public void AddEntity(FileSystemEntity entity){
        contents.add(entity);
    }
    public void RemoveEntity(String Name){
        contents.removeIf(e->e.GetName().equals(Name));
    }
    public FileSystemEntity search(String name) {
        for (FileSystemEntity e : contents) {
            if (e.GetName().equals(name)) return e;

            if (e instanceof Directory) {
                FileSystemEntity found = ((Directory) e).search(name);
                if (found != null) return found;
            }
        }
        return null;
    }
    @Override
    public void Display(String indent) {
        System.out.println(indent + "Directory: " + Name);
        for (FileSystemEntity e : contents) {
            e.Display(indent + "  ");
        }
    }
}


