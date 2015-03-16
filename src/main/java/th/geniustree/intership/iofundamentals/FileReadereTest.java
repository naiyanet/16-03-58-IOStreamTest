package th.geniustree.intership.iofundamentals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class FileReadereTest {

    public static void main(String[] args) throws Exception {
        Reader reader = null;
        BufferedReader buffer = null;
        try {
            reader = new FileReader("C:/Users/M6500/Desktop/input.txt");
            buffer = new BufferedReader(reader);
            char[] ch = new char[255];
            while (true) {
                int result = buffer.read(ch);
                if (result == -1) {
                    break;
                }
                System.out.println(new String(ch, 0, result));
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

    }
}
