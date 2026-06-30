import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = n>1;
        
        for(int i =2; i*i <=n; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        } if(isPrime){
            System.out.println(n +" is prime number.");
        }
    }
}
