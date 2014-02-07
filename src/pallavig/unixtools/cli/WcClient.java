package pallavig.unixtools.cli;

import pallavig.unixtools.wc.WC;
import pallavig.unixtools.wc.WCCommandBuilder;
import pallavig.unixtools.wc.WCOptionProcessor;
import reader.FileContentReader;

public class WcClient {
    public static void main(String[] args) {
        int numberOfLines = 0, numberOfWords = 0, numberOfCharacters = 0;
        WCCommandBuilder builder = new WCCommandBuilder(args);
        String fileName = builder.getFileName();
        FileContentReader fcr = new FileContentReader();
        String fileData = fcr.readFile(fileName);
        WC lib = new WC(fileData);
        StringBuilder finalResult = new StringBuilder();
        if(builder.isCountLines())
            finalResult.append(lib.countLines() + "\t");
        if(builder.isCountWords())
            finalResult.append(lib.countWords() + "\t");
        if(builder.isCountCharacters())
            finalResult.append(lib.countCharacters() + "\t");
        finalResult.append(fileName);
        System.out.println(finalResult);
    }
}