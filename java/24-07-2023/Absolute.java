import java.util.Scanner;
class Absolute {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int n = sc.nextInt();    
    if(n < 0) n = -n;
    System.out.println("The absolute value is : " + n);
}
}