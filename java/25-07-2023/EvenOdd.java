import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        if(n % 2 ==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
}
