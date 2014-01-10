package pallavig.unixtools.cli;

import pallavig.unixtools.head.Head;
import pallavig.unixtools.headtailoptionprocessor.HeadTailOptionProcessor;
import reader.FileContentReader;

public class HeadClient {
    public static void main(String[] args) {
        HeadTailOptionProcessor hop = new HeadTailOptionProcessor(args);
        FileContentReader fcr = new FileContentReader();
        String fileData = fcr.readFile(hop.filename);
        Head head = new Head(fileData,hop.numberOfRows);
        String result = head.getHeader();
        System.out.println(result);
    }
}
