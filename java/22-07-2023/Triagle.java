// Write a java program to take length and height from the user and find area of triagle.
import java.util.Scanner;
public class Triagle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int h = sc.nextInt();
        float area = (h * l)/2;
        System.out.println(area);
    }
}
