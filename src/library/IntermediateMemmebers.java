package library;

public class IntermediateMemmebers extends Members{
    private int maxItemAllowed;
    //default constructor
    public BasicMembers(){
        super();
        this.maxItemAllowed=3;
    }
    public int getMaxItemAllowed(){return maxItemAllowed;}

}
