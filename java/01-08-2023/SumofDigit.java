// WAJP to find Sum of Digits.
import java.util.Scanner;
public class SumofDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        int sum = 0;

        while(n > 0){
            sum += n%10;
            n /=10;
        }
        System.out.println("The sum of digit is : " + sum );
    }    
}
