package pallavig.unixtools.cli;

import pallavig.unixtools.headtailoptionprocessor.HeadTailOptionProcessor;
import pallavig.unixtools.tail.Tail;
import reader.FileContentReader;

public class TailClient {
    public static void main(String[] args) {
        HeadTailOptionProcessor top = new HeadTailOptionProcessor(args);
        FileContentReader fcr = new FileContentReader();
        String filData = fcr.readFile(top.filename);
        Tail tail = new Tail(filData,top.numberOfRows);
        String result = tail.getLines();
        System.out.println(result);
    }
}