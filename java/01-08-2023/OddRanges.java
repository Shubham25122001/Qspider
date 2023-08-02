import java.util.Scanner;
public class OddRanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter starting ranges : ");
        int low = sc.nextInt();
        System.out.println("Enter higher Ranges : ");
        int high = sc.nextInt();

        while(high >= low){
            if(low % 2 != 0)
            System.out.print(low + " ");
            low++;
        }
    }
    
}
