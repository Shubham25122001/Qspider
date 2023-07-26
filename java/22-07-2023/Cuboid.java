// Write a java program to take length, brath and height from the user and find area and volume of cuboid
import java.util.Scanner;
public class Cuboid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        // 2 lw + 2 wh + 2hl.

        int area = 2 * l * b + 2 * b * h + 2 * h * l;
        int volume = l * b * h;
        System.out.println("area : "+ area); 
        System.out.println("volume : "+ volume); 
    }
    
}
