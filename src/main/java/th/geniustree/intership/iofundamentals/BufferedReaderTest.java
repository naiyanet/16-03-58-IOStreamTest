/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intership.iofundamentals;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderTest {

    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("file.encoding"));
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:/Users/M6500/Desktop/input.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("C:/Users/M6500/Desktop/output.txt"));
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                bufferedWriter.append(new String(data));
                System.out.println(data);
            }
        } finally {
            bufferedWriter.close();
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }

}
