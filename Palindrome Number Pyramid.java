import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //outer loop
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop part 1-backwards
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //inner loop part 2
            for(int j=2; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
