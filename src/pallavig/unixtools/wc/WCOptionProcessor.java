package pallavig.unixtools.wc;

import java.util.Arrays;
import java.util.List;

public class WCOptionProcessor {
    public boolean isCountLines;
    public boolean isCountWords;
    public boolean isCountCharacters;
    public String fileName;
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