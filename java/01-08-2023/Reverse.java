// WAJP to find reverse of no.
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int reverse = 0;

        while(n > 0){
            reverse = reverse*10 + n%10;
            n /= 10;
        }
        System.out.println("The Reverse Number is : "+ reverse);


    }
    
}
