package pallavig.unixtools.cli;

import pallavig.unixtools.wc.WC;
import reader.FileContentReader;

public class WcClient {
    public static void main(String[] args) {
        int numberOfLines = 0, numberOfWords = 0, numberOfCharacters = 0;
        String fileName = args[0];
        FileContentReader fcr = new FileContentReader();
        String fileData = fcr.readFile(fileName);
        WC lib = new WC(fileData);
        numberOfLines = lib.countLines();
        numberOfCharacters = lib.countCharacters();
        numberOfWords = lib.countWords();
        System.out.println(numberOfLines + "\t" + numberOfWords + "\t" + numberOfCharacters);
    }
}