 class demo {
    //constructor 
    demo(){
        System.out.println("object created");
    }
}
class GarbageCollectionDemo{
    public static void main(String[] args) {
        //create two objects 
        demo d1=new demo();
        demo d2= new demo();
        //remove reference to the object
        d1=null;
        d2=null;
        System.out.println("objects are no longer referenced.");
        //requst garbage collection
        System.gc();
        System.out.println("garbage collevtion requested.");
    }
}
