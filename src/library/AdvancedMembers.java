package library;

public class AdvancedMembers extends Members{
    private int maxItemAllowed;
    // default constructor
    public AdvancedMembers(){
        super();
        this.maxItemAllowed=5;
    }
    public int getMaxItemAllowed(){return maxItemAllowed;}

}
