package library;

public class Magazine extends Item {
    private String publisher;
    private int releasedNumber;

    //default constructor
    Magazine(){
        super();
        this.publisher="Unknown";
        this.releasedNumber=0
    }
    //parameterized constructor
    Magazine(int ID, String title, int year, boolean Borrowed, int duration, String publisher, int numberReleased){
        super(int ID, String title, int year, boolean Borrowed, int duration);
        this.publisher=publisher;
        this.releasedNumber=numberReleased;
    }
}
