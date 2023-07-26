import java.util.Scanner;
class LastDigitSum {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the First Number : ");
    int a = sc.nextInt();  
    System.out.println("Enter the Second Number : ");
    int b = sc.nextInt();
    int sum = a%10 + b%10;
    System.out.println("The Sum of the last digits of both the numbers is : "+ sum);
    } 
    
}
