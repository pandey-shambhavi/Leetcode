import java.util.*;
class Function{
    public static int isOdd(int n){
        int sum = 0;
        for(int i=0; i <= n; i++){
            if(i%2 != 0){
                sum+= i;
            }
        }return sum;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = isOdd(n);// calling function
        System.out.print("The sum of odd numbers is: " + sum);
    }
}
