package labs_examples.input_output.labs;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {


        FileInputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;

        String filePath = "/Users/beetle/Desktop/CodingProjects/online-java-fundamentals/src/labs_examples/input_output/files/byte_data";


        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));

            byte[] buffer = new byte[5];
            int bytesRead = 0;
            while((bytesRead = bufferedInputStream.read(buffer)) != -1){
                System.out.println(new String(buffer, 0, bytesRead));
            }

        }catch (IOException exc){
            exc.printStackTrace();
        }finally {
            try{
                inputStream.close();
                System.out.println("InputStream closed.");
                bufferedInputStream.close();
                System.out.println("BufferedInputStream closed.");
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}