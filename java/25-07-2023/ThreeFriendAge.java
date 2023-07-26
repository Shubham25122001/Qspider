import java.util.Scanner;
public class ThreeFriendAge {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter the age of A :");
     int a = sc.nextInt();
     System.out.println("Enter the age of B :");
     int b = sc.nextInt();
     System.out.println("Enter the age of c :");
     int c = sc.nextInt();

     if(a > b && a > c){
        System.out.println("A is oldest");
     }
     else if(b > a && b > c){
        System.out.println("B is oldest");
     }
     else{
        System.out.println("C is oldest");
     }
 }    
}
