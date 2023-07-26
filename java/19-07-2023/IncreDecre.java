import java.util.Scanner;
class IncreDecre{
    public static void main(String[] args){
        int x = -5;
        int y = x++;
        y = ++x + x++;
        System.out.println("The value of x is : "+ x);
        System.out.println("The value of y- is :" + y);
        
    }
}