// WAJP to print this Series :
// a) A a B v C c D d E e .............Z z
// b) Z z Y y..............C c B b A a
// c) A b C d E f................x Y z
// Z y x ......................B a

public class Series {
    public static void main(String[] args) {
    //    for(char ch = 'A', ch1 = 'a'; ch <= 'Z' && ch1 <= 'z'; ch++, ch1++){
    //     System.out.print(ch + " " + ch1 + " ");
    //    }
    //    System.out.println();
    //     for(char ch = 'Z', ch1 = 'z'; ch >= 'A' && ch1 >= 'a'; ch--, ch1--){
    //     System.out.print(ch + " " + ch1 + " ");
    //    }
    //    for(char ch = 'A', ch1 = 'b'; ch <= 'Z' && ch1 <= 'z'; ch+=2, ch1+=2){
    //     System.out.print(ch + " " + ch1 + " ");
    //    }
    //    System.out.println();
    //     for(char ch = 'Z', ch1 = 'y'; ch >= 'A' && ch1 >= 'a'; ch-=2, ch1-=2){
    //     System.out.print(ch + " " + ch1 + " ");

        for(char ch='A';ch<='Z';ch++)
        {
            System.out.print(ch+" "+(char)(ch+32)+" ");
        }
        System.out.println();
        for(char ch='Z';ch>='A';ch--)
        {
            System.out.print(ch+" "+(char)(ch+32)+" ");
        }
        System.out.println();
        for(char ch='A';ch<='Z';ch+=2)
        {
            System.out.print(ch+" "+(char)(ch+33)+" ");
        }
        System.out.println();
        for(char ch='Z';ch>='A';ch-=2)
        {
            System.out.print(ch+" "+(char)(ch+31)+" ");
        }





       }
    }
    

