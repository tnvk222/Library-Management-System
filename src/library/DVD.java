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
}
