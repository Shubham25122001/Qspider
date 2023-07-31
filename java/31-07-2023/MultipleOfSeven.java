import java.util.Scanner;
public class MultipleOfSeven {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n = sc.nextInt();
    for(int i = 0; i <= n; i+=7){
        System.out.print(i + " ");
    }    
}
}
