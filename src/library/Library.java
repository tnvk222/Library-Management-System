package library;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args){
        ArrayList<Members> m= addMembers();
        ArrayList<Item> i=addLibraryItems();
        displayAllMembers(m);
        displayAllItems(i);

    }





    public static  ArrayList<Item> addLibraryItems(){
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
                a.input();
                a.setTitle(title);
                a.setID(ID);
                a.setBorrowingDuration(duration);
                a.setYearPublished(year);
                a.setIsBorrowed(isBorrowed);
                libraryItems.add(a);
                System.out.println(" Item added! ID: " + a.getID() + " | Title: " + a.getTitle());
            }
        }
        return libraryItems;
    }
    public static ArrayList<Members> addMembers(){
        Scanner input=new Scanner(System.in);
        int ID=0;
        String name;
        Members members =null;
        ArrayList<Members> membersArrayList=new ArrayList<>();
        while(true){
            System.out.print("add a member name or press 'exit' to finish: ");
            name=input.next();
            if(name.equals("exit")) break;
            else{
                ID++; int chooseMemberType;
                System.out.println("Membership Type\n1. Basic($10)\n2. Intermediate($30)\n3. Advanced($50)\nchoose: ");
                chooseMemberType=input.nextInt();
                if(chooseMemberType == 1){
                    members=new BasicMembers();
                }
                else if(chooseMemberType == 2){
                    members=new IntermediateMembers();
                }
                else if(chooseMemberType == 3){
                    members=new AdvancedMembers();
                }
                members.setID(ID);
                members.setName(name);
                members.getMaxItemAllowed();
                membersArrayList.add(members);
            }
        }
        return membersArrayList;
    }
    public static void displayAllMembers(ArrayList<Members> membersList) {
        if (membersList == null || membersList.isEmpty()) {
            System.out.println("📭 No members registered.");
            return;
        }
        System.out.println("\n📋 MEMBERS LIST (" + membersList.size() + " members)");
        for (Members member : membersList) {
            String type = member.getClass().getSimpleName();
            System.out.println("   " + type + " ID: " + member.getID() + ", Name: " + member.getName() + ", Max Items: " + member.getMaxItemAllowed());
        }
    }
    public static void displayAllItems(ArrayList<Item> itemsList) {
        if (itemsList == null || itemsList.isEmpty()) {
            System.out.println("📭 No items in the library.");
            return;
        }
        System.out.println("\n📚 LIBRARY ITEMS (" + itemsList.size() + " items)");
        int bookCount = 0, dvdCount = 0, magazineCount = 0;
        for (Item item : itemsList) {
            if (item instanceof Book) {
                bookCount++;
                System.out.println("\n📖 BOOK #" + bookCount);
            } else if (item instanceof DVD) {
                dvdCount++;
                System.out.println("\n🎬 DVD #" + dvdCount);
            } else if (item instanceof Magazine) {
                magazineCount++;
                System.out.println("\n📰 MAGAZINE #" + magazineCount);
            }
            item.display();  // ✅ Calls the correct display() method for each type
        }
        System.out.println("\n📊 SUMMARY");
        System.out.println("   Total Items: " + itemsList.size());
        System.out.println("   Books: " + bookCount);
        System.out.println("   DVDs: " + dvdCount);
        System.out.println("   Magazines: " + magazineCount);
    }
}
