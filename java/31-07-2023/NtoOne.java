//  WAJP to print no. from n to 1
import java.util.Scanner;
public class NtoOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(int i = n; i>=1; i--){
            System.out.print(i + " ");
        }
        
    }    
}
