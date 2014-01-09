package reader;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileContentReader {
    public String readFile(String filename) {
        StringBuilder sb = new StringBuilder();
        String data;
        String sCurrentLine = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((sCurrentLine = br.readLine()) != null) {
                sb.append(sCurrentLine).append("\n");
            }
        } catch (Exception e) {
            System.err.println("Problem in reading file");
        }
        data = sb.toString().substring(0,sb.length() - 1);
        return data;
    }
}