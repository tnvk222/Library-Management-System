package library;

public class BasicMembers extends Members{
    private int maxItemAllowed;

    //default constructor
    public BasicMembers(){
        super();
        this.maxItemAllowed=2;
    }
    //getter
    public int getMaxItemAllowed(){return maxItemAllowed;}
}
