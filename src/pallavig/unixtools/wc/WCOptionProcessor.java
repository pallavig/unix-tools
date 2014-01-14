package pallavig.unixtools.wc;

import java.util.Arrays;
import java.util.List;

public class WCOptionProcessor {
    private boolean isCountLines;
    private boolean isCountWords;
    private boolean isCountCharacters;
    private String fileName;

    public boolean getIsCountLines() {
        return isCountLines;
    }

    public boolean getIsCountWords() {
        return isCountWords;
    }

    public boolean getIsCountCharacters() {
        return isCountCharacters;
    }

    public String getFileName() {
        return fileName;
    }

    public WCOptionProcessor(String[] args) {
        for (String arg : args) {

            if(!arg.startsWith("-")){
                fileName = arg;
            }
        }
        List list = Arrays.asList(args);
        isCountLines = list.contains("-l");
        isCountCharacters = list.contains("-c");
        isCountWords = list.contains("-w");
        if(isCountLines == false && isCountWords == false && isCountCharacters == false){
            isCountLines = true;
            isCountCharacters = true;
            isCountWords = true;
        }

    }
}