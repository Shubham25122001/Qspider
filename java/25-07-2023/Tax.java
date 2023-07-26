import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income : ");
        int income = sc.nextInt();
        if(income < 500000){
            System.out.println("No Tax to be paid");
        }
        else if(income >= 500000){
            System.out.println("Tax to be paid");
        }
    }
}
