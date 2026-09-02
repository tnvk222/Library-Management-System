package library;

import java.util.Scanner;

public abstract class Item {
    private int ID;
    private String title;
    private int yearPublished;
    boolean isBorrowed;
    int borrowingDuration;

    //default constructor
    public Item(){
        this.ID=0;
        this.title="Unknown";
        this.yearPublished=0;
        this.isBorrowed=false;
        this.borrowingDuration=0;
    }
    public Item(int ID, String title, int year, boolean Borrowed, int duration){
        this.ID=ID;
        this.title=title;
        this.yearPublished=year;
        this.isBorrowed=Borrowed;
        this.borrowingDuration=duration;
    }
    //getters
    public int getID(){return this.ID;}
    public String getTitle(){return this.title;}
    public int getYearPublished(){return this.yearPublished;}
    public boolean getIsBorrowed(){return this.isBorrowed;}
    public int getBorrowingDuration(){return this.borrowingDuration;}

    //setters
    public void setID(int ID){this.ID=ID;}
    public void setTitle(String title){this.title=title;}
    public void setYearPublished(int year){this.yearPublished=year;}
    public void setIsBorrowed(boolean isBorrowed){this.isBorrowed=isBorrowed;}
    public void setBorrowingDuration(int borrowingDuration){this.borrowingDuration=borrowingDuration;}

    public abstract void input();
    public abstract void display();
    }
