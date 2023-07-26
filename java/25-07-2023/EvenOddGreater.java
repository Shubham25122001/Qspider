import java.util.Scanner;

public class EvenOddGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Integer number : ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            if(num > 1000){
                System.out.println("Even and above 1000");
            }
            else{
                System.out.println("Even");
            }
        }
        else {
            if(num > 1000){
                System.out.println("Odd and Above 1000");
            }
            else{
                System.out.println("odd");
            }
        }
    }    
}
