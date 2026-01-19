import java.util.*;
public class Monoalaphetic{
    static String key="QWERTYUIOPASDFGHJKLZXCVBNM";
    public static String encrypt(String plaintext){
        plaintext=plaintext.toUpperCase();
        StringBuilder ciphertext=new StringBuilder();
        for(char ch:plaintext.toCharArray()){
            if(Character.isLetter(ch)){
                int index=ch-'A';
                ciphertext.append(key.charAt(index));

            }
            else{
                ciphertext.append(ch);
            }
        }
        return ciphertext.toString();
    }
    public static String decrypt(String ciphertext){
        ciphertext=ciphertext.toUpperCase();
        StringBuilder plaintext=new StringBuilder();
        for(char ch: ciphertext.toCharArray()){
            if(Character.isLetter(ch)){
                int index=key.indexOf(ch);
                plaintext.append((char)('A'+index));

            }
            else{
            plaintext.append(ch);
        }
    } 
    return plaintext.toString();
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter plain text: ");
    String plaintext=sc.nextLine();
    String encrypted=encrypt(plaintext);
    System.out.println("Encrypted text:"+encrypted);
    String decrypted=decrypt(encrypted);
    System.out.println("Decrypted text: "+decrypted);
    sc.close();
}
}