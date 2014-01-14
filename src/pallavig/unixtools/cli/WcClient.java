package pallavig.unixtools.cli;

import pallavig.unixtools.wc.WC;
import pallavig.unixtools.wc.WCOptionProcessor;
import reader.FileContentReader;

public class WcClient {
    public static void main(String[] args) {
        int numberOfLines = 0, numberOfWords = 0, numberOfCharacters = 0;
        WCOptionProcessor wcOption = new WCOptionProcessor(args);
        String fileName = wcOption.fileName;
        FileContentReader fcr = new FileContentReader();
        String fileData = fcr.readFile(fileName);
        WC lib = new WC(fileData);
        if(wcOption.isCountWords){
            numberOfLines = lib.countLines();
            System.out.print(numberOfLines + "\t");
        }
        if(wcOption.isCountWords){
            numberOfWords = lib.countWords();
            System.out.print(numberOfWords + "\t");
        }
        if(wcOption.isCountCharacters){
            numberOfCharacters = lib.countCharacters();
            System.out.print(numberOfCharacters + "\t");
        }
        System.out.println(fileName);
    }
}