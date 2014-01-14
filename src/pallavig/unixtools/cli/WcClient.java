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
        StringBuilder finalResult = new StringBuilder();
        if(wcOption.isCountLines)
            finalResult.append(lib.countLines() + "\t");
        if(wcOption.isCountWords)
            finalResult.append(lib.countWords() + "\t");
        if(wcOption.isCountCharacters)
            finalResult.append(lib.countCharacters() + "\t");
        finalResult.append(fileName);
        System.out.println(finalResult);
    }
}