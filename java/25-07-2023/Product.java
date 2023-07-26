import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the third number : ");
        int c = sc.nextInt();
        System.out.print("Enter the fourth number : ");
        int d = sc.nextInt();
        int product = a * b * c * d;
        if(product > 1000){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
