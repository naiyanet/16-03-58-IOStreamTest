/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intership.iofundamentals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author M6500
 */
public class OuputStreamTest {
    public static void main(String[] args) throws IOException{
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try{
            inputStream = new FileInputStream("C:/Users/M6500/Desktop/input.txt");
            outputStream = new FileOutputStream("C:/Users/M6500/Desktop/output.txt");
            byte[] bytes = new byte[1024];
            int index;
            while((index = inputStream.read(bytes)) != -1){
                System.out.println("index ="+index);
                outputStream.write(bytes, 0, index);
            }
        }finally{
            if(outputStream != null){
                outputStream.close();
           }
            if(inputStream != null){
                inputStream.close();
            }
        }
    }
}
