package library;

public class Members {
 int ID;
 String name;

 //default constructor
 Members(){
  this.ID=0;
  this.name="Unknown";
 }
 //parameterized constructor
 Members(int ID, String name){
  this.ID=ID;
  this.name=name;
 }
}
