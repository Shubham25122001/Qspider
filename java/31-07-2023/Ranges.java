// WAJP to print no. between two ranges.
import java.util.Scanner;
public class Ranges {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower range : ");
        int low = sc.nextInt();
        System.out.print("Enter the higher range : ");
        int high = sc.nextInt();
        for(int i = low; i<= high; i++){
            System.out.print(i +" ");
        }
    }
    
}
