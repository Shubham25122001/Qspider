import java.util.Scanner;
public class Switch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character : ");
        char ch = sc.next().charAt(0);
        
        switch(ch){
            case 'A':
            System.out.println("Excellent!");
            break;

            case 'B':
            System.out.println("Well done!");
            break;

            case 'C':
            System.out.println("You passed!");
            break;

            case 'F':
            System.out.println("Better luck next time!");
            break;

            default :
            System.out.println("Invalid grade input Formate");

        }
    }

}