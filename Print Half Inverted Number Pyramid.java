import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//outer loop-rows
		for(int i=1; i<=n;i++){
		    //inner loop-number
		    for(int j=i; j<=n;j++){
		        System.out.print(i + " ");
		    }System.out.println();    
		}
	}
}
