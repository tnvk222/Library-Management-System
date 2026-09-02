package library;

public class DVD extends Item {
    private String director;
    private String durationInMinutes;
    private int rating;
    //default constructor
    public DVD(){
        super();
        this.director="Unknown";
        this.durationInMinutes="Unknown";
        this.rating=0;
    }
    //parametwrized constructor
    public DVD(int ID, String title, int year, boolean Borrowed, int duration, String director, String durationInMinutes, int rating){
        super(int ID, String title, int year, boolean Borrowed, int duration);
        this.director=director;
        this.durationInMinutes=durationInMinutes;
        this.rating=rating;
    }
}
