package library;

import java.util.Scanner;

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
    //parameterized constructor
    public Book(int ID, String title, int year, boolean Borrowed, int duration, String author, int pages, String genre){
        super(ID, title,year, Borrowed, duration);
        this.author=author;
        this.pages=pages;
        this.genre=genre;
    }
    //getters
    public String getAuthor(){return this.author;}
    public int getPages(){return this.pages;}
    public String getGenre(){return this.genre;}

    //setters
    public void setAuthor(String author){this.author=author;}
    public void setPages(int pages){this.pages=pages;}
    public void setGenre(String genre){this.genre=genre;}

    @Override
    public void input(){
        Scanner input=new Scanner(System.in);
        String author,genre;int pages;
        System.out.print("Enter the author of the book: ");
        setAuthor(author=input.next());
        System.out.print("Enter the pages of the book: ");
        setPages(pages= input.nextInt());
        System.out.print("Enter the genre of the book: ");
        setGenre(genre= input.next());
    }
}
