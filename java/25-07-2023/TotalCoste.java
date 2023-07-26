import java.util.Scanner;
class TotalCoste {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units : ");
        int u = sc.nextInt();
        int total_cost = u*100;
        if(total_cost > 1000){
            total_cost = total_cost - total_cost*10/100;
        }
        System.out.println("the total coste is : " + total_cost);
    }
    
}
