import java.util.*;
class Function {
	public static boolean isEligible(int age) {
	     if(age>=18){
	         return true;
	     }else{
	         return false;
	     }
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
        boolean result = isEligible(age);
        if(result == true){
        System.out.print("The given age is eligible to vote.");
	    } else{
	        System.out.print("The given age is not eligible to vote.");
	    }
    }
}
