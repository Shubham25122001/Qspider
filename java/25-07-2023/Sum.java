import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y : ");
        int y = sc.nextInt();
        System.out.print("Enter the value of z : ");
        int z = sc.nextInt();
        int sum = x+y+z;
        if(sum<150){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
}
