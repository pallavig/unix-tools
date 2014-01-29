package pallavig.unixtools.cli;

import pallavig.unixtools.headtailoptionprocessor.HeadTailOptionProcessor;
import pallavig.unixtools.tail.Tail;
import reader.FileContentReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class TailClient {
    public static void main(String[] args) throws FileNotFoundException {
        HeadTailOptionProcessor top = new HeadTailOptionProcessor(args);
        FileContentReader fcr = new FileContentReader();
        String filData = fcr.readFile(top.filename);
        int numberOfRows = top.numberOfRows;
        String fileData = fcr.readFile(top.filename);
        Properties tailDefaultLines = new Properties();
        int defaultLines;
        if(numberOfRows == 0){
            try {
                BufferedReader br = new BufferedReader(new FileReader(System.getenv("UNIX_TOOLS")+"/config.properties"));
                tailDefaultLines.load(br);
                defaultLines = Integer.parseInt(tailDefaultLines.getProperty("Tail-Default-Lines"));
                numberOfRows = defaultLines;
            }
            catch(Exception e){
                numberOfRows = 10;
            }
        }
        Tail tail = new Tail(fileData,numberOfRows);
        String result = tail.getLines();
        System.out.println(result);
    }
}