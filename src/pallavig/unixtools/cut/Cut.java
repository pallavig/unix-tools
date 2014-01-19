package pallavig.unixtools.cut;

public class Cut {
    String fileData;
    int[] fieldNumbers;
    String delimiter;
    public Cut(String fileData,int[] fieldNumbers,String delimiter){
        this.fileData = fileData;
        this.fieldNumbers = fieldNumbers;
        this.delimiter = delimiter;
    }

    public String cutLines(){
        String[] lines = fileData.split("\n");
        StringBuilder result = new StringBuilder("");
        String[] fields;
        for (String line : lines) {
            fields = line.split(delimiter);
            StringBuilder eachLine = new StringBuilder("");
            for (int fieldNumber : fieldNumbers) {
                   fieldNumber--;
                   if(fieldNumber >= fields.length)
                       eachLine.append("");
                   else
                       eachLine.append(fields[fieldNumber]).append(delimiter);

            }
            if(eachLine.length() > 0)
                eachLine.setLength(eachLine.length() - 1);
            eachLine.append("\n");
            result.append(eachLine);
        }
        return result.toString().substring(0,result.length()-1);
    }
}