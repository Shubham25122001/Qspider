import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();
        if(marks < 33){
            marks = marks + 4;
            System.out.println("The final marks of the Student is : "+ marks);
        }
        else{
            System.out.println("The final marks of the student is : "+ marks);
        }
    }
}
