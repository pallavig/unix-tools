package pallavig.unixtools.cli;

import pallavig.unixtools.cut.Cut;
import pallavig.unixtools.cut.CutOptionProcessor;
import reader.FileContentReader;

public class CutClient {
    public static void main(String[] args) {
        CutOptionProcessor cop = new CutOptionProcessor(args);
        FileContentReader fcr = new FileContentReader();
        String fileData = fcr.readFile(cop.fileName);
        Cut cut = new Cut(fileData,cop.fieldNumbers,cop.delimiter);
        System.out.println("delimiter" + cop.delimiter + "this");
        String result = cut.cutLines();
        System.out.println(result);
    }
}
