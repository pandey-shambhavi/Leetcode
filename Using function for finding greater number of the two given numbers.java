import java.util.*;
class Function {
	public static int isGreater(int a, int b) {
	    if(a>b){
		    return a;
		}else {
		    return b;
		}
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int result = isGreater(a,b);
        System.out.print("The greater number of the two is: " + result);
	}
}
