import java.util.*;
public class Congruence{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a: ");
            int a=sc.nextInt();
        System.out.println("Enter value of b: ");
            int b=sc.nextInt();
        System.out.println("Enter value of c: ");
            int n=sc.nextInt();
        for(int i=1;i<=a*b;i++){
            if((a*i)/n==b){
                System.out.println(" the congrent of a & b is "+i);
               System.exit(1);
            }  
        }
        System.out.println(" there is not congrent ");
    }    
}