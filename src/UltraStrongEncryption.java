import java.util.Arrays;

/**
 * Created by Eugene Karpenko on 09.04.2015.
 */
public class UltraStrongEncryption {

    private static final char KEY = '3';
    private static final char[] STRONG_KEY = {'0','R','c'};
    private static final String MESSAGE = "This is my secret message";

    public static void main (String[] args) {

        String encryptedMessage = crypt(MESSAGE, KEY);
        String decryptedMessage = crypt(encryptedMessage, KEY);

        System.out.println("Encrypted message: " + encryptedMessage);
        System.out.println("Decrypted message: " + decryptedMessage);

        String strongEncryptedMessage = crypt(MESSAGE, STRONG_KEY);
        String strongDecryptedMessage = crypt(strongEncryptedMessage, STRONG_KEY);

        System.out.println("Encrypted message: " + strongEncryptedMessage);
        System.out.println("Decrypted message: " + strongDecryptedMessage);
    }

    public static String crypt(String message, char key) {
        char[] chars = message.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] ^= key;
        }

        return String.copyValueOf(chars);
    }

    public static String crypt(String message, char[] key) {
        char[] chars = message.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] ^= key[i % key.length];
        }

        return String.copyValueOf(chars);
    }

}
