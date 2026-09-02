package library;

public class Members {
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
}
