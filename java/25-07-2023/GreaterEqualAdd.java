import java.util.Scanner;

public class GreaterEqualAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y : ");
        int y = sc.nextInt();
        System.out.print("Enter the value of z : ");
        int z = sc.nextInt();

        if(x >= 20 && z < 100){
            z += 200;
        }
        else if(x >= 10 && y < 50){
            z += 100;
        }
        System.out.println("The final value of z is : "+ z);
    }
}
