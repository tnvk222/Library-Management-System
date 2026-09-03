package library;
import java.util.Scanner;

public class DVD extends Item {
    private String director;
    private int durationInMinutes;
    private int rating;
    //default constructor
    public DVD(){
        super();
        this.director="Unknown";
        this.durationInMinutes=0;
        this.rating=0;
    }
    //parameterized constructor
    public DVD(int ID, String title, int year, boolean Borrowed, int duration, String director, int durationInMinutes, int rating){
        super(ID, title,year, Borrowed, duration);
        this.director=director;
        this.durationInMinutes=durationInMinutes;
        this.rating=rating;
    }
    //getters
    public String getDirector() {return this.director;}
    public int getDurationInMinutes() {return this.durationInMinutes;}
    public int getRating() {return this.rating;}
    //setters
    public void setDirector(String director) {this.director = director;}
    public void setDurationInMinutes(int durationInMinutes) {this.durationInMinutes = durationInMinutes;}
    public void setRating(int rating) {this.rating = rating;}
    @Override
    public void input(){
        Scanner input=new Scanner(System.in);
        String director;int duration,rating;
        System.out.print("Enter director: ");
        setDirector(director=input.next());
        System.out.print("Enter rating (1-10): ");
        setRating(rating=input.nextInt());
        System.out.print("Enter duration (in minutes): ");
        setDurationInMinutes(duration=input.nextInt());
    }
    public void display(){
            System.out.println("🎬 DVD");
            System.out.println("   ID: " + getID());
            System.out.println("   Title: " + getTitle());
            System.out.println("   Year: " + getYearPublished());
            System.out.println("   Borrowed: " + (getIsBorrowed() ? "Yes" : "No"));
            System.out.println("   Duration (days): " + getBorrowingDuration());
            System.out.println("   Director: " + getDirector());
            System.out.println("   Rating: " + getRating() + "/10");
            System.out.println("   Runtime: " + getDurationInMinutes() + " minutes");
            System.out.println("   --------------------");
    }
}
