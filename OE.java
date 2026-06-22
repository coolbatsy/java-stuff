import java.util.*;

public class OE {
	public static void main(String[] args){

	// to check if two numbers are odd or even 

	System.out.print("User, enter a number: ");

	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	  
	  if(num%2 == 0){
		System.out.println("This is an even number.");
	  }

	  else{
		System.out.println("This is an odd number.");
	  }
	sc.close();
	}
}
	
	
	
 		