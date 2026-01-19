import java.util.Scanner;

public class PremitiveRoot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Prime: ");
        int p=s.nextInt();
        
        for(int g=2;g<p;g++){
            boolean[] hit=new boolean[p];
            int count=0;
            long v=1;
            for(int e=1;e<p;e++){
                v=(v*g)%p;
                if(!hit[(int)v]){
                    hit[(int)v]=true;
                    count++;
                }
            }
            if(count==p-1){
                System.out.println("Root: "+g);
                return;
            }
        }
    }
}
