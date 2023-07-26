import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.println("Enter the value of c : ");
        int c = sc.nextInt();
        if (a > b && a < c || a > c && a < b)
            System.out.println("The second largest number is "+a);
        else if (b > a && b < c || b > c && b < a)
            System.out.println("The second largest number is "+b);
        else
            System.out.println("The second largest number is "+c);
    
  
    }
}
