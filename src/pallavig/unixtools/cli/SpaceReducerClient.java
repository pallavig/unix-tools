package pallavig.unixtools.cli;

import pallavig.unixtools.reducespaces.SpaceReducer;
import reader.FileContentReader;

import java.io.FileWriter;
import java.io.IOException;

public class SpaceReducerClient {
    public static void main(String[] args) {
        String fileData = "";
        String fileName = args[0];
        FileContentReader fcr = new FileContentReader();
        fileData = fcr.readFile(fileName);
        SpaceReducer sp = new SpaceReducer(fileData);
        fileData = sp.reduceSpaces();
        FileWriter fw = null;
        try {
            fw = new FileWriter(fileName);
            fw.write(fileData);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}