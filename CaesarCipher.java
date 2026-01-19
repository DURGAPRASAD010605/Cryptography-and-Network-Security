import java.util.Scanner;
public class CaesarCipher {
 static String encrypt(String text,int key){
    String encrypted="";
    for(int i=0;i<text.length();i++){
        char ch=text.charAt(i);
        if(ch>='A'&&ch<='Z'){
            ch=(char)((ch-'A'+key)%26+'A');

        }
        else if(ch>='a'&&ch<='z'){
            ch=(char)((ch-'a'+key)%26+'a');
            
        }
        encrypted=encrypted+ch;
    }
    return encrypted;
 }   
 static String decrypt(String text,int key){
    String decrypted="";
    for(int i=0;i<text.length();i++){
        char ch=text.charAt(i);
        if(ch>='A'&&ch<='Z'){
            ch=(char)((ch-'A'-key)%26+'A');

        }
        else if(ch>='a'&&ch<='z'){
            ch=(char)((ch-'a'-key)%26+'a');
            
        }
        decrypted=decrypted+ch;
    }
    return decrypted;
 }   
 public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the message: ");
    String message=sc.nextLine();
    System.out.print("Enter the key: ");
    int key=sc.nextInt();
    String encryptedtext=encrypt(message, key);
    String decryptedtext=decrypt(encryptedtext, key);
    System.out.println("Encrypted text: "+encryptedtext);
    System.out.println("Decrypted text : "+decryptedtext);
sc.close();
 }
}
