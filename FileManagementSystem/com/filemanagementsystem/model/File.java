package com.filemanagementsystem.model;

public class File extends FileSystemEntity {
    private int size;//Only File should control its own data
    private String ftype;//Only File should control its own data
    public File(String Name,int s,String typ){
        super(Name);
        this.size=s;
        this.ftype=typ;
    }
    public int GetSize(){
        return size;
    }
    public String GetType(){
        return ftype;
    }
    @Override
    // @Override indicates that this method is overriding the abstract method from parent class
    public void Display(String space){
        System.out.println(space+"Name:"+Name+"(size:"+size+"type:"+ftype+")");
    }

}
