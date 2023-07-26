import java.util.Scanner;
public class GreaterK{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 1000){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}