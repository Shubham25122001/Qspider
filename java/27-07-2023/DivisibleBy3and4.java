import java.util.Scanner;
public class DivisibleBy3and4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        if(n % 3 == 0 && n % 4 == 0){
            System.out.println("Divisible by 3 and 4");
        }
        else{
            System.out.println("Not Divisible");
        }
    }
}
