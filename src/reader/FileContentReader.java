package reader;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileContentReader {
    public String readFile(String filename) {
        String data = "";
        String sCurrentLine = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((sCurrentLine = br.readLine()) != null) {
                data += sCurrentLine + "\n";
            }
        } catch (Exception e) {
            System.err.println("Problem in reading file");
        }
        data = data.substring(0, data.length() - 1);
        return data;
    }
}