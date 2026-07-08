import java.util.*;
class Function {
	public static double isCircumference(double rad) {
	    return 2*rad*3.41; 
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double rad = sc.nextDouble();
        double result = isCircumference(rad);
        System.out.print("The circumference of the circle is: " + result);
	}
}
