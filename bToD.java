//Binery to Decimal
import java.util.*;
public class bToD{
    public static void binToDec(int binNum){
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum /= 10;
        }
        System.out.println(decNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter ur Binary digit :");
        int binNum = sc.nextInt();
        binToDec(binNum);
        
    }
}