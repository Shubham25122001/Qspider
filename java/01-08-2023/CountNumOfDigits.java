// WAJP to find number of Digits.
import java.util.Scanner;
public class CountNumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        int count = 0;

        while(n != 0){
            n /=10;
            count++;
        }
        System.out.println("The count of digit is : " + count );
    }    
}
