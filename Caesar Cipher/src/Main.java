import java.util.Scanner;

public class Main{
    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";

    public static String encryptData(String inputStr, int shiftKey)
    {
        inputStr = inputStr.toLowerCase();

        StringBuilder encryptStr = new StringBuilder();

        for (int i = 0; i < inputStr.length(); i++)
        {
            int pos = alpha.indexOf(inputStr.charAt(i));

            int encryptPos = (shiftKey + pos) % 26;
            char encryptChar = alpha.charAt(encryptPos);

            encryptStr.append(encryptChar);
        }

        return encryptStr.toString();
    }

    public static String decryptData(String inputStr, int shiftKey)
    {
        inputStr = inputStr.toLowerCase();

        StringBuilder decryptStr = new StringBuilder();

        for (int i = 0; i < inputStr.length(); i++)
        {

            int pos = alpha.indexOf(inputStr.charAt(i));

            int decryptPos = (pos - shiftKey) % 26;

            if (decryptPos < 0){
                decryptPos = alpha.length() + decryptPos;
            }
            char decryptChar = alpha.charAt(decryptPos);

            decryptStr.append(decryptChar);
        }
        return decryptStr.toString();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string for encryption using Caesar Cipher: ");
        String inputStr = sc.nextLine();

        System.out.println("Enter the value by which each character in the plaintext message gets shifted: ");
        int shiftKey = Integer.parseInt(sc.nextLine());

        System.out.println("Encrypted Data ===> "+encryptData(inputStr, shiftKey));
        System.out.println("Decrypted Data ===> "+decryptData(encryptData(inputStr, shiftKey), shiftKey));

        sc.close();
    }
}   