package com.filemanagementsystem.model;

//This is the base class for both File and Directory.
abstract public class FileSystemEntity {
    protected String Name;//Both File and Directory need direct access(Same class + subclasses)
    FileSystemEntity(String n){
        this.Name=n;
    }
    public String GetName(){
        return Name;
    }
    public abstract void Display(String space);//No implementaion of method
    //forces all the subclass to implement Display method
}
