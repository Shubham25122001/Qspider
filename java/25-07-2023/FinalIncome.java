import java.util.Scanner;
public class FinalIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        
        System.out.println("Enter your Salary : ");
        int salary = sc.nextInt();

        if(age > 60){
            salary += 1000;
        }
        else if(age > 40 && age <= 60){
            salary += 500;
        }
        else if(age <= 40){
            salary += 0;
        }
        System.out.println("Your final income is : " + salary);

       }
}
