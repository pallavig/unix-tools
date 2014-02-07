package pallavig.unixtools.wc;

public class WCCommandBuilder {
    private boolean isCountLines;
    private boolean isCountWords;
    private boolean isCountCharacters;
    private String fileName;

    public WCCommandBuilder(String[] args) {
        for (String arg : args) {
            with(arg);
        }
        boolean allFalseCondition;
        allFalseCondition = (isCountWords()==false) && (isCountLines()==false) && (isCountCharacters()==false);
        if(allFalseCondition){
            isCountLines = true;
            isCountWords = true;
            isCountCharacters = true;
        }

    }

    public boolean isCountLines() {
        return isCountLines;
    }

    public boolean isCountWords() {
        return isCountWords;
    }

    public boolean isCountCharacters() {
        return isCountCharacters;
    }

    public String getFileName() {
        return fileName;
    }

    public void with(String option) {
        if(option.equals("-c"))
            isCountCharacters = true;
        else if(option.equals("-w"))
            isCountWords = true;
        else if(option.equals("-l"))
            isCountLines = true;
        else
            fileName = option;
    }
}
