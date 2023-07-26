// Write a java program to take radius from the user and find area and circumference 
import java.util.Scanner;
class Circle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float pi = 3.14f;
        int r = sc.nextInt();
        float area = pi*r*r;
        float Circumference = 2 * pi * r;
        System.out.println("area " + area);
        System.out.println("Circumference "+ Circumference);
    }
}