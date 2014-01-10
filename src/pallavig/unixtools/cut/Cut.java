package pallavig.unixtools.cut;

public class Cut {
    String fileData;
    int fieldNo;
    String delimiter;
    public Cut(String fileData,int fieldNo,String delimiter){
        this.fileData = fileData;
        this.fieldNo = fieldNo;
        this.delimiter = delimiter;
    }

    public String cutLines(){
        String[] lines = fileData.split("\n");
        StringBuilder result = new StringBuilder();
        String[] fields;
        for (int i = 0; i < lines.length; i++) {
            fields = lines[i].split(delimiter);
            if(fields.length >= fieldNo) {
                result.append(fields[fieldNo - 1]);
            }
            result.append("\n");
        }
        return result.toString();
    }
}