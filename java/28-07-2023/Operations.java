import java.util.Scanner;
public class Operations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        switch(n){
            case 10 : {
                System.out.println(a+b);
                break;
            }
            case 20 : {
                System.out.println(a-b);
                break;
            }
            case 30 : {
                System.out.println(a*b);
                break;
            }
            case 40 : {
                System.out.println(a%b);
                break;
            }
            case 50 : {
                System.out.println(a/b);
                break;
            }
            default : {
                System.out.println("Enter a valid number");
            }
        }

    }
}
