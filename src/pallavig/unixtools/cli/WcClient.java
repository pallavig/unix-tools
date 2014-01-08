package pallavig.unixtools.cli;

import pallavig.unixtools.wc.WC;

public class WcClient {
    public static void main(String[] args) {
        int numberOfLines = 0, numberOfWords = 0, numberOfCharacters = 0;
        String filename = args[0];
        WC lib = new WC(filename);
        numberOfLines = lib.countLines();
        numberOfCharacters = lib.countCharacters();
        numberOfWords = lib.countWords();
        System.out.println(numberOfLines + "\t" + numberOfWords + "\t" + numberOfCharacters);
    }
}