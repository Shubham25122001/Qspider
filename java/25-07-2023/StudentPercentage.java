import java.util.Scanner;
public class StudentPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Math : ");
        int m = sc.nextInt();
        System.out.println("physics : ");
        int p = sc.nextInt();
        System.out.println("cemistry : ");
        int c = sc.nextInt();
        System.out.println("english : ");
        int e = sc.nextInt();
        System.out.println("hindi : ");
        int h = sc.nextInt();
        int total_marks = m + p + c + e + h;
        double percentage = (total_marks*100)/500;
        System.out.println("The total marks is : "+ total_marks);
        System.out.println("The percentage is : "+ percentage);
    }
}
