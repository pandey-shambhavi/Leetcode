import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    //outer loops
	    for(int i=1; i<=n; i++){
	       //space inner loop
	       for(int j=1; j<=n-i; j++){
	           System.out.print(" ");
	       }
	       //inner loop
	       for(int j=1; j<=i; j++){
	           System.out.print("*");
	       }
	       System.out.println();
	    }
	}
}	
