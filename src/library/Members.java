package library;

public abstract class Members {
 int ID;
 String name;

 //default constructor
 public Members(){
  this.ID=0;
  this.name="Unknown";
 }
 //parameterized constructor
 public Members(int ID, String name){
  this.ID=ID;
  this.name=name;
 }
 //getters
 public int getID(){return ID;}
 public String getName(){return name;}
 //setters
 public void setID(int ID) {this.ID = ID;}
 public void setName(String name) {this.name = name;}
}
