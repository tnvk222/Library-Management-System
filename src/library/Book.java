package library;

public class Book extends Item{
    private String author;
    private int pages;
    private String genre;

    //default constructor
    public Book(){
        super();
        this.author="Unknown";
        this.pages=0;
        this.genre="Unknown";
    }
    //parametwrized constructor
    public Book(int ID, String title, int year, boolean Borrowed, int duration, String author, int pages, String genre){
        super(int ID, String title, int year, boolean Borrowed, int duration);
        this.author=author;
        this.pages=pages;
        this.genre=genre;
    }
    //getters
    public String getAuthor(){return this.author;}
    public int getPages(){return this.pages;}
    public String genre(){return this.genre;}

    //setters
    public void setAuthor(String author){this.author=author;}
    public void setPages(int pages){this.pages=pages;}
    public void setGenre(String genre){this.genre=genre;}



}
