import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //outer loop-rows
        for(int i=1; i<=n; i++){
            //inner loop spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //inner loop star
            for(int j=1; j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
