package pallavig.unixtools.wc;

import java.io.BufferedReader;
import java.io.FileReader;

public class WC {
    String fileData;

    public WC(String filename) {
        fileData = "";
        readFile(filename);
    }
    private void readFile(String filename) {
        String sCurrentLine = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((sCurrentLine = br.readLine()) != null) {
                fileData += sCurrentLine;
            }
        } catch (Exception e) {
            System.err.println("Problem in reading file");
        }
    }

    public int countLines() {
        int numberOfLines = fileData.split("\n").length;
        return numberOfLines;
    }

    public int countCharacters() {
        int numberOfCharacters = fileData.length();
        return numberOfCharacters;
    }

    public int countWords() {
        int numberOfWords = fileData.split(" ").length;
        return numberOfWords;
    }
}