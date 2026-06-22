import java.util.*;
public class Six {

    public static void main(String[] args){
       // to check if the user is adult or not
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your age: ");
       int age = sc.nextInt();
         if(age>=18){
            System.out.println("You are an adult");
         }
         else{
            System.out.println("You are not an adult");
        }
        sc.close();
    }
}



