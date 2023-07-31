/*
 * A if the character is from character a and tilt the character w both a and w included, then jump three times to right and print the resulting character as explained in the example below,

For eg. If a is given then print d, if b is given then print the character e. If cis given then print the character f, if

wis given then print the character 2

B Else print the string Can't Jump.

2. Condition 2: If the entered character is a capital-case character, ther

Auf the character is from character D and fill the character 2 both D and Z included, then jump three times to left and print the resulting character as explained in the example below,

For eg. If Das given then print A if E is given then print the character B. If F is given then print the character C

If Zis given then print the character W

& Else print the string Can't jump.
 */


 
import java.util.Scanner;
public class SmallCapital {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = sc.next().charAt(0);
        if(ch >= 97 && ch <= 122){
            if(ch <= 'w')
            System.out.println(ch += 3);
            else
            System.out.println("Can't Jump");
        }
        else{
            if(ch >= 'D')
            System.out.println(ch -= 3);
            else{
                System.out.println("Can't Jump");
            }
        
        }
    }    
}
