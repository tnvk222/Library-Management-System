package library;
import  java.util.Scanner;
public class Magazine extends Item {
    private String publisher;
    private int releasedNumber;

    //default constructor
    public Magazine(){
        super();
        this.publisher="Unknown";
        this.releasedNumber=0;
    }
    //parameterized constructor
    public Magazine(int ID, String title, int year, boolean Borrowed, int duration, String publisher, int numberReleased){
        super(ID, title,year, Borrowed, duration);
        this.publisher=publisher;
        this.releasedNumber=numberReleased;
    }
    //getters
    public String getPublisher() {return publisher;}
    public int getReleasedNumber() {return releasedNumber;}

    //setters
    public void setPublisher(String publisher) {this.publisher = publisher;}
    public void setReleasedNumber(int releasedNumber) {this.releasedNumber = releasedNumber;}
    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        String publisher; int released;
        System.out.print("Enter publisher: ");
        setPublisher(publisher=input.next());
        System.out.print("Enter release number: ");
        setReleasedNumber(released= input.nextInt());
    }
    @Override
    public void display() {
        System.out.println("📰 MAGAZINE");
        System.out.println("   ID: " + getID());
        System.out.println("   Title: " + getTitle());
        System.out.println("   Year: " + getYearPublished());
        System.out.println("   Borrowed: " + (getIsBorrowed() ? "Yes" : "No"));
        System.out.println("   Duration: " + getBorrowingDuration() + " days");
        System.out.println("   Publisher: " + getPublisher());
        System.out.println("   Release Number: " + getReleasedNumber());
        System.out.println("   --------------------");
    }
}
