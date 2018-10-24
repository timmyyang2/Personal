
public class Cipher {
    private static String encryption = "";
    
    public static String encrypt(int key, String message){
        message = message.toUpperCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        
        for (int i = 1; i < message.length()+1;i++){
            int index_in_alpha = alphabet.indexOf(message.charAt(i-1));
            int shift = (index_in_alpha + key)%26;
            
            encryption = encryption + alphabet.charAt(shift);
        }
        return encryption;
    }
}
