package library;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int choice;
        System.out.println("LIBRARY MANAGEMENT SYSTEM");
        ArrayList<Item> i=addLibraryItems();
        System.out.println("\n");
        ArrayList<Members> m= addMembers();
        ArrayList<Item> issuedItems = new ArrayList<>();

        boolean LOOP = true;
        while(LOOP) {
            System.out.print("\n1. View all Members\n 2. View all Library Item\n3. View issued items\n4. Issue an item to a member\n5. Return an item\n6. exit\n Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    displayAllMembers(m);
                    break;
                case 2:
                    displayAllItems(i);
                    break;
                case 3:
                    displayIssuedItems(issuedItems);
                    break;
                case 4:
                    issueItem(i, issuedItems, m);
                    break;
                case 5:
                    returnItem(i, issuedItems);
                    break;
                case 6:
                    System.out.println("exit");
                    LOOP = false;
                    break;
                default:
                    System.out.println("invalid choice");
                    break;


            }
        }

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
                System.out.println(" Item added! ID: " + a.getID() + ", Title: " + a.getTitle());
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
            System.out.println("No members registered.");
            return;
        }
        System.out.println("\nMEMBERS LIST (" + membersList.size() + " members)");
        for (Members member : membersList) {
            String type = member.getClass().getSimpleName();
            System.out.println("   " + type + " ID: " + member.getID() + ", Name: " + member.getName() + ", Max Items: " + member.getMaxItemAllowed());
        }
    }
    public static void displayAllItems(ArrayList<Item> itemsList) {
        if (itemsList == null || itemsList.isEmpty()) {
            System.out.println("No items in the library.");
            return;
        }
        System.out.println("\nLIBRARY ITEMS (" + itemsList.size() + " items)");
        int bookCount = 0, dvdCount = 0, magazineCount = 0;
        for (Item item : itemsList) {
            if (item instanceof Book) {
                bookCount++;
                System.out.println("\nBOOK" + bookCount);
            } else if (item instanceof DVD) {
                dvdCount++;
                System.out.println("\nDVD" + dvdCount);
            } else if (item instanceof Magazine) {
                magazineCount++;
                System.out.println("\nMAGAZINE" + magazineCount);
            }
            item.display();
        }
        System.out.println("\nSUMMARY");
        System.out.println("   Total Items: " + itemsList.size());
        System.out.println("   Books: " + bookCount);
        System.out.println("   DVDs: " + dvdCount);
        System.out.println("   Magazines: " + magazineCount);
    }
    public static void displayIssuedItems(ArrayList<Item> issuedItems) {
        if (issuedItems == null || issuedItems.isEmpty()) {
            System.out.println("No items currently issued.");
            return;
        }
        System.out.println("\n ISSUED ITEMS (" + issuedItems.size() + " items)");
        for (Item item : issuedItems) {
            item.display();
            System.out.println("   --------------------");
        }
    }
    public static void issueItem(ArrayList<Item> libraryItems,ArrayList<Item> issuedItems, ArrayList<Members> membersList) {
        Scanner input=new Scanner(System.in);
        System.out.println("\nAVAILABLE ITEMS:");
        ArrayList<Item> availableItems = new ArrayList<>();
        for (Item item : libraryItems) {
            if (!item.getIsBorrowed()) {
                availableItems.add(item);
                System.out.println("   ID: " + item.getID() + ", Title: " + item.getTitle() + ",Type: " + item.getClass().getSimpleName());
            }
        }
        if (availableItems.isEmpty()) {
            System.out.println("No items available for borrowing.");
            return;
        }
        System.out.print("\nEnter Item ID to issue: ");
        int itemID = input.nextInt();
        Item itemToIssue = null;
        for (Item item : libraryItems) {
            if (item.getID() == itemID && !item.getIsBorrowed()) {
                itemToIssue = item;
                break;
            }
        }
        if (itemToIssue == null) {
            System.out.println("Item with ID " + itemID + " not available.");
            return;
        }
        System.out.println("\nMEMBERS:");
        for (Members member : membersList) {
            System.out.println("   ID: " + member.getID() + ", Name: " + member.getName() + ", Max Items: " + member.getMaxItemAllowed());
        }
        // Get member ID
        System.out.print("\nEnter Member ID: ");
        int memberID = input.nextInt();
        // Find the member
        Members member = null;
        for (Members m : membersList) {
            if (m.getID() == memberID) {
                member = m;
                break;
            }
        }
        if (member == null) {
            System.out.println("Member with ID " + memberID + " not found.");
            return;
        }
        // Check borrowing limit
        int issuedCount = 0;
        for (Item item : issuedItems) {
            issuedCount++;
        }
        if (issuedCount >= member.getMaxItemAllowed()) {
            System.out.println("Member '" + member.getName() + "' has reached max borrowing limit (" +
                    member.getMaxItemAllowed() + " items).");
            return;
        }
        //Issue the item
        itemToIssue.setIsBorrowed(true);
        issuedItems.add(itemToIssue);
        System.out.println("\nITEM ISSUED SUCCESSFULLY!");
        System.out.println("   Item: " + itemToIssue.getTitle());
        System.out.println("   Type: " + itemToIssue.getClass().getSimpleName());
        System.out.println("   To: " + member.getName());
        System.out.println("   Member ID: " + member.getID());
    }
    public static void returnItem(ArrayList<Item> libraryItems, ArrayList<Item> issuedItems) {
        Scanner input = new Scanner(System.in);

        if (issuedItems.isEmpty()) {
            System.out.println("No items currently issued.");
            return;
        }

        System.out.println("\nISSUED ITEMS:");
        for (Item item : issuedItems) {
            System.out.println("ID: " + item.getID() + ", Title: " + item.getTitle() + ", Type: " + item.getClass().getSimpleName());
        }

        System.out.print("\nEnter Item ID to return: ");
        int itemID = input.nextInt();

        Item itemToReturn = null;
        for (Item item : issuedItems) {
            if (item.getID() == itemID) {
                itemToReturn = item;
                break;
            }
        }

        if (itemToReturn == null) {
            System.out.println("Item with ID " + itemID + " is not currently issued.");
            return;
        }

        itemToReturn.setIsBorrowed(false);
        issuedItems.remove(itemToReturn);

        System.out.println("\nITEM RETURNED SUCCESSFULLY!");
        System.out.println("   Item: " + itemToReturn.getTitle());
        System.out.println("   Type: " + itemToReturn.getClass().getSimpleName());
    }


}
