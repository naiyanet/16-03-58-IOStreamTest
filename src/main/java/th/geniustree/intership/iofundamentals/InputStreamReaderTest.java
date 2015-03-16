/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intership.iofundamentals;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderTest {

    public static void main(String[] args) throws IOException{
        InputStream inputStream = null;
        Reader reader = null;
        BufferedReader buffer = null;
        try{
            inputStream = new FileInputStream("C:/Users/M6500/Desktop/input.txt");
            reader = new InputStreamReader(inputStream);
            buffer = new BufferedReader(reader);
            int data;
            while(true){
                data = buffer.read();
                if(data== -1){
                    break;
                }
                System.out.println("char --> " + (char)data);                
            }
        }finally{
            if(reader != null){
                reader.close();
            }
            if(inputStream != null){
                inputStream.close();
            }
        }
    }
    
}
