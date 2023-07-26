import java.util.Scanner;

public class AgeSalExperience {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age : ");
        int age = sc.nextInt();
        System.out.print("Enter the salary : ");
        int salary = sc.nextInt();
        System.out.println("Enter the years of experience : ");
        int experience = sc.nextInt();
        
        if(age > 60 && salary > 20000 && experience > 20){
            salary += 5000;
        }
        else if(age > 40 && salary > 15000 && experience > 10){
            salary += 2000;
        }
        else if(age > 30 &&  salary > 10000 && experience > 5){
            salary += 1000;
        }
        else{
            salary += 500;
        }
        System.out.println("the final salary is : "+ salary);
    }
}
