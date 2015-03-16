
package th.geniustree.intership.iofundamentals;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest {

    public static void main(String[] args) throws IOException {
       Writer writer = null;
       try{
           writer = new FileWriter("C:/Users/M6500/Desktop/output.txt");
           writer.append("naiyanet momo-1234567890");

       }finally{
           if(writer != null){
               writer.close();
           }
       }
    }
    
}
