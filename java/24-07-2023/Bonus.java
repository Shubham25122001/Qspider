import java.util.Scanner;

class Bonus {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your salary : ");
    int sal = sc.nextInt();
    System.out.println("Enter the years of Experience :");
    int year = sc.nextInt();
    int bonus = 0;
    if(year > 5){
        bonus = (sal*5)/100;
    }
    System.out.println("The Salary is : "+ sal);
    System.out.println("Years of Service is : "+ year);
    System.out.println("The Bonus is : "+ bonus);
}
}