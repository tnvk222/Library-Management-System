package library;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args){
        Item a=null;
        ArrayList<Item>libraryItems=new ArrayList<>();
        Scanner input= new Scanner(System.in);
        System.out.println("Lets get started");
        int ID=100;
        String title; int year; boolean isBorrowed;int duration,choice;
        while (true){
            System.out.print("add a library title name or press 'exit' to finish: ");
            title=input.next();
            if(title.equals("exit")) break;
            else{
                ID++;
                System.out.print("Enter published year: ");
                year = input.nextInt();
                isBorrowed=false;
                System.out.print("Enter borrowing duration: ");
                duration= input.nextInt();
                System.out.print("Item type\n1. Book\n2. DVD\n3. Magazine\n choose: ");
                choice= input.nextInt();
                if(choice == 1){
                    a=new Book();
                }
                else if (choice == 2){
                    a=new DVD();
                }
                else if(choice == 3){
                    a= new Magazine();
                }
                }
        }
    }

}
