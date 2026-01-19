import java.util.*;
public class Polyalphabetic{
   
    public static String encrypt(String plaintext,String key){
        plaintext=plaintext.toUpperCase();
        StringBuilder ciphertext=new StringBuilder();
        key=key.toUpperCase();
        int keyindex=0;
        for(char ch:plaintext.toCharArray()){
            if(Character.isLetter(ch)){
               int p=ch-'A';
               int k=key.charAt(keyindex)-'A';
               char c= (char)((p+k)%26+'A');
               ciphertext.append(c);
               keyindex=(keyindex+1)%key.length();
            }
            else{
                ciphertext.append(ch);

            }
        }
        return ciphertext.toString();

    }
    public static String decrypt(String ciphertext,String key){
        ciphertext=ciphertext.toUpperCase();
        key=key.toUpperCase();
        StringBuilder plaintext=new StringBuilder();
        int keyindex=0;
        for(char ch:ciphertext.toCharArray()){
            if(Character.isLetter(ch)){
                int c=ch-'A';
               int k=key.charAt(keyindex)-'A';
               char p= (char)((c-k+26)%26+'A');
               plaintext.append(p);
               keyindex=(keyindex+1)%key.length();
            }
            else{
                plaintext.append(ch);

            }
            
        }
        return plaintext.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Plain text: ");
        String plaintext=sc.nextLine();
        System.out.print("Enter Key: ");
        String key=sc.nextLine();
        String encrypted=encrypt(plaintext,key);
        System.out.println("Encrypted text : "+encrypted);
        String decrypted=decrypt(encrypted,key);
        System.out.println("Decrypted text: "+decrypted);
        sc.close();
        

    }
}