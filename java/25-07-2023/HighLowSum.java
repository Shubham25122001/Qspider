import java.util.Scanner;
public class HighLowSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y : ");
        int y = sc.nextInt();
        int sum = x + y;
        if(sum >= 100){
            System.out.println("High sum");
        }
        else{
            System.out.println("Low Sum");
        }
    }
}
