import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    
	    String str = "";
	    for(int i=1; i<=a; i++){
	        str = str + "*"; 
	    }
	    for(int i= 1; i<=b; i++){
	        System.out.print(str); 
	        System.out.println();
	      }
	  }
}	
