import java.util.Scanner;

public class Gender {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Gender in M/F : ");
    char ch = sc.next().charAt(0);
    switch(ch){
        case 'M' :
        System.out.println("Male");
        break;

        case 'F' :
        System.out.println("Female");
        break;

        default :
        System.out.println("Please enter a valid gender");
    }
    }
    
}
