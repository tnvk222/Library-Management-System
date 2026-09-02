package library;

public class Book extends Item{
    private String author;
    private int pages;
    private String genre;

    //default constructor
    Book(){
        super();
        this.author="Unknown";
        this.pages=0;
        this.genre="Unknown";
    }
    //parametwrized constructor
    Book(int ID, String title, int year, boolean Borrowed, int duration, String author, int pages, String genre){
        super(int ID, String title, int year, boolean Borrowed, int duration);
        this.author=author;
        this.pages=pages;
        this.genre=genre;
    }
}
