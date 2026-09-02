package library;

public class Item {
    private int ID;
    private String title;
    private int yearPublished;
    boolean isBorrowed;
    int borrowingDuration;

    //default constructor
    Item(){
        this.ID=0;
        this.title="Unknown";
        this.yearPublished=0000;
        this.isBorrowed=False;
        this.borrowingDuration=0
    }
    Item(int ID, String title, int year, boolean Borrowed, int duration){
        this.ID=ID;
        this.title=title;
        this.yearPublished=year;
        this.isBorrowed=Borrowed;
        this.borrowingDuration=duration;
    }
}
