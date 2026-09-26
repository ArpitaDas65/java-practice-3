import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        //create an integer array
        int[]numbers={1,2,3,4,5};
        //convert the array to string 
        String arrayAsString=Arrays.toString(numbers);

        //display the result
        System.out.println("array as a string:"+arrayAsString);
    }
    
}
