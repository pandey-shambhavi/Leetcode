import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//1st half-outer loop
		for(int i=1; i<=n;i++){
		    //part 1 stars
		    for(int j=1; j<=i;j++){
		        System.out.print("*");
		    }
		    //space
		    int spaces = 2*(n-i);
		    for(int j=1; j<=spaces;j++){
		        System.out.print(" ");
		    }
		    //part 2 stars
		    for(int j=1; j<=i;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		//2nd half-outer loop
		for(int i=n; i>=1;i--){
		    //part 1 stars
		    for(int j=1; j<=i;j++){
		        System.out.print("*");
		    }
		    //space
		    int spaces = 2*(n-i);
		    for(int j=1; j<=spaces;j++){
		        System.out.print(" ");
		    }
		    //part 2 stars
		    for(int j=1; j<=i;j++){
		        System.out.print("*");
		    }
		    System.out.println();
        }
	}
}
