package library;

public class IntermediateMembers extends Members{
    private int maxItemAllowed;
    //default constructor
    public IntermediateMembers(){
        super();
        this.maxItemAllowed=3;
    }
    @Override
    public int getMaxItemAllowed(){return maxItemAllowed;}

}
