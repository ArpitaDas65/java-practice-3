public class index {
    //public attribute
    public int publicAttribute=42;
    //private attribute
    private int privateAttribute=42;
    //public method
    public void publicMethod(){
        System.out.println("this is a public method.");
    }
    //private method
    private void privateMethod(){
        System.out.println("this is a private method.");
    }
    public static void main(String[] args) {
        index obj = new index();
        //accessing public attribute
        System.out.println("public attribute:"+obj.publicAttribute);
        //calling public method
        obj.publicMethod();
        //private members can be accessed inside the same class
        System.out.println("private attribute:"+obj.privateAttribute);
        obj.privateMethod();

    }
    
}
