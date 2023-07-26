// You will given an interger as input, you have to print true if the number is greater than 100, and false otherwise.
import java.util.Scanner;
class Greater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        if(n > 100){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
}
