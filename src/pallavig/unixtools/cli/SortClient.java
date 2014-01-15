package pallavig.unixtools.cli;

import pallavig.unixtools.sort.Sort;
import pallavig.unixtools.sort.SortOptionProcessor;
import reader.FileContentReader;

public class SortClient {
    public static void main(String[] args) {
        String fileData;
        SortOptionProcessor sop = new SortOptionProcessor(args);
        FileContentReader fcr = new FileContentReader();
        fileData = fcr.readFile(sop.getFilename());
        Sort sort = new Sort(fileData,sop.getFieldNumber(),sop.getIsReverse(),sop.getDelimiter());
        String result = sort.sortData();
        System.out.println(result);
    }
}