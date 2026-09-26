public class example {
    //default attribute
    int defaultAttribute =42;
    //default method
    void defaultMethod(){
        System.out.println("this is a default method ");
    }
    public static void main(String[] args) {
        //create an object
        example obj= new example();
        //access default attribute
        System.out.println("default attribute:"+obj.defaultAttribute);
        //call default method 
        obj.defaultMethod(); 
    }
    
}
