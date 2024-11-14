package exercices.exercice13;

import java.util.Base64;

public class exercice13 {
 public static final String PASSWORD = "YnJhdjA"; 

    public static final char[] CHARACTERS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}; 

 

    public static void main(String[] args) { 
while (condition 
) {
    
}

    } 

 

    public static boolean testPassword(String password) { 

        boolean retour = false; 

        byte[] decodedBytes = Base64.getDecoder().decode(PASSWORD); 

        String decodedPwd = new String(decodedBytes); 

 

        if (password.equals(decodedPwd)) { 

            retour = true; 

        } 

        return retour; 

    } 



    }























}
