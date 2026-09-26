import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        //create a sorted integer array
        int[] numbers={1,2,3,4,5};
        //elements to search
        int key =3;
        //search for the key
        int index=Arrays.binarySearch(numbers,key);
        //check whether the element was found 
        if(index>=0)
        {
            System.out.println("element"+key+"found at index"+index);
        }
        else{
            System.out.println("element"+key +"not found.");
        }

    }
    
}
