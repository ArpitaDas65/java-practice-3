class animal {
    void eat(){
        System.out.println("animal eats");
    }
    
}
class dog extends animal{
    void bark(){
        System.out.println("dog barks");
    }
}
public class InheritanceDemo{
    public static void main(String[] args) {
        //create and object of dog
        dog d=new dog();
        //calling inherited method
        d.eat();
        //calling dog's own method
        d.bark();
    }
}
