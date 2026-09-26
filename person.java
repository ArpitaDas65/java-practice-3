public class person {
    //attributes
 String name;
 int age;
 String address;
 //constructor
 public person(String name,int age,String address){
    this.name=name;
    this.age=age;
    this.address=address;
 }  
 //method to display person details
 public void displayDetails(){
    System.out.println("name"+name);
    System.out.println("age"+age);
    System.out.println("address"+address);
 }
 //main method 
 public static void main(String[] args) {
    //create a person object
    person person1=new person("Sumit",  21, "Punjab");
    //display details
    person1.displayDetails();
 }

}
