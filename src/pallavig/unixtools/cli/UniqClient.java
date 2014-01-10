package pallavig.unixtools.cli;

import pallavig.unixtools.uniq.Uniq;
import reader.FileContentReader;

public class UniqClient {
    public static void main(String[] args) {
        String fileName = args[0];
        String fileData;
        FileContentReader fcr = new FileContentReader();
        fileData = fcr.readFile(fileName);
        Uniq uniq = new Uniq(fileData);
        String uniqLines = uniq.getUniqLines();
        System.out.println(uniqLines);
    }
}
