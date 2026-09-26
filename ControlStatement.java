import java.util.Scanner;

public class ControlStatement {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter your marks :");
        int marks=sc.nextInt();

        //if-else
            if(marks>=40){
                System.out.println("result:pass");
            
            }else{
                System.out.println("result:fail");
            }
            //else if ladder
            if (marks>=90){
                System.out.println("grade:A+");
            }
            else if(marks>=40){
                System.out.println("grade:D");
            }
            else{
                System.out.println("grade:F");
            }
    }
}