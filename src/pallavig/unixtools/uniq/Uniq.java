package pallavig.unixtools.uniq;

public class Uniq {
    String fileData;
    public Uniq(String fileData){
        this.fileData = fileData;
    }
    public String getUniqLines(){
        String[] linesInData = fileData.split("\r\n");
        StringBuilder uniqueLines = new StringBuilder();
        String currentLine,previousLine = null;
        for (int i = 0; i < linesInData.length ; i++) {
            currentLine = linesInData[i];
            if(currentLine.equals((previousLine))){
                previousLine = currentLine;
                continue;
            }
            uniqueLines.append(currentLine).append("\r\n");
            previousLine = currentLine;
        }
        return uniqueLines.toString();
    }
}