package labs_examples.input_output.labs;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.*;


/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */
public class Exercise_02 {

    public static void main(String[] args) {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        String x;


/*
          try{
            inputStream = new BufferedReader(new FileReader("/Users/beetle/Desktop/CodingProjects/online-java-fundamentals/src/labs_examples/input_output/files/char_data.txt"));
            outputStream = new PrintWriter(new FileWriter("/Users/beetle/Desktop/CodingProjects/online-java-fundamentals/src/labs_examples/input_output/files/Exercise_2.txt"));

            while((x = inputStream.readLine()) != null){
                outputStream.println(x);
            }

        }catch(IOException exc){
            System.out.println("An error occurred " + exc.getMessage());
        }finally {
            try {
                inputStream.close();
            } catch (IOException exc) {
                exc.printStackTrace();
            }

            try{
                outputStream.close();
            } catch(IOException exc){
                exc.printStackTrace();
            }
        }


    }


    public static void test(){

        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
        keyPairGenerator.initialize(2048);
        KeyPair pair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = pair.getPublic();

        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        byte[] original ="I like jokes.".getBytes();
        cipher.update(original);

        byte [] cipherText = cipher.doFinal();
        System.out.println(new String(cipherText, "UTF8"));

    }
    */
    }
}
