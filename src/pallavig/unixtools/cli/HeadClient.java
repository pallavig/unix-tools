package pallavig.unixtools.cli;

import pallavig.unixtools.head.Head;
import pallavig.unixtools.head.HeadOptionProcessor;
import reader.FileContentReader;

public class HeadClient {
    public static void main(String[] args) {
        HeadOptionProcessor hop = new HeadOptionProcessor(args);
        FileContentReader fcr = new FileContentReader();
        String fileData = fcr.readFile(hop.filename);
        Head head = new Head(fileData,hop.numberOfRows);
        String result = head.getHeader();
        System.out.println(result);
    }
}
