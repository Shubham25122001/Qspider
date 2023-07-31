import java.util.Scanner;

public class AgeSal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        System.out.print("Enter your salary : ");
        int salary = sc.nextInt();
        if(age > 40){
            if(salary >= 30000){
                System.out.println("You are rich and adult");
            }
            else{
                System.out.println("You are an adult");
            }
        }
        else if(age <= 40){
            if(salary >= 120000){
                System.out.println("You are rich and young");
            }
            else{
                System.out.println("You are young");
            }
        }
        }

    }
