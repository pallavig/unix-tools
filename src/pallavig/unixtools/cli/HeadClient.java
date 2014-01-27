package pallavig.unixtools.cli;

import pallavig.unixtools.head.Head;
import pallavig.unixtools.headtailoptionprocessor.HeadTailOptionProcessor;
import reader.FileContentReader;

import java.io.*;
import java.util.Properties;

public class HeadClient {
    public static void main(String[] args) throws FileNotFoundException {
        HeadTailOptionProcessor hop = new HeadTailOptionProcessor(args);
        FileContentReader fcr = new FileContentReader();
        int numberOfRows = hop.numberOfRows;
        String fileData = fcr.readFile(hop.filename);
        Properties headDefaultLines = new Properties();
        int defaultLines;
        if (numberOfRows == 0) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(System.getenv("UNIX_TOOLS") + "/config.properties"));
                headDefaultLines.load(br);
                defaultLines = Integer.parseInt(headDefaultLines.getProperty("Head-Default-Lines"));
                numberOfRows = defaultLines;
            } catch (FileNotFoundException e) {
                numberOfRows = 10;
            } catch (IOException e) {
                numberOfRows = 10;
            }
        }
        Head head = new Head(fileData, numberOfRows);
        String result = head.getHeader();
        System.out.println(result);
    }
}