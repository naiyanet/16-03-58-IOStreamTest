/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intership.iofundamentals;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author M6500
 */
public class InputStreamTest {
    public static void main(String[] args) throws IOException{
        InputStream inputStream = null;
        try{
            inputStream = new FileInputStream("C:/Users/M6500/Desktop/input.txt");
            byte[] bytes = new byte[1024];
            int index;
            while((index = inputStream.read(bytes)) != -1){
                System.out.println("index ="+index);
            }
        }finally{
            if(inputStream != null){
                inputStream.close();
            }
        }
    }
}
