import java.util.*;           //decimal to binary
public class dToB{
    public static void decToBin(int n){
        int pow = 0;
        int binNum = 0;
        while(n>0){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n /= 2;
        }
        System.out.println(binNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter ur digit :");
        int n = sc.nextInt();
       decToBin(n)
       ;
    }
}