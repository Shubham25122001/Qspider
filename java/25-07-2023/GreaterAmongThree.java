import java.util.Scanner;
public class GreaterAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y : ");
        int y = sc.nextInt();
        System.out.println("Enter the value of z : ");
        int z = sc.nextInt();

        if(x >= 20){
            if(y >= 100){
                z = z + 100;
            }
            else if(y < 100 && y >= 50){
                z = z + 50;
            }
            else{
                z = z + 10;
            }
        }
        else if(x < 20){
            if(y >= 100){
                z = z + 3;
            }
            else if(y < 100 && y >= 50){
                z = z + 2;
            }
            else{
                z = z + 1;
            }
        }
        System.out.println("The Final Value of z is : " + z);
    }
}
