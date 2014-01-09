package pallavig.unixtools.head;

public class Head {
    private String data;
    private int numberOfRows;
    public Head(String fileData,int requiredNumberOfRows){
        numberOfRows = requiredNumberOfRows;
        data = fileData;
    }
    public String getHeader(){
        String headerData = "";
        String[] linesInData = data.split("\n");
        try {
             for (int i = 0; i < numberOfRows; i++){
                 headerData = headerData.concat(linesInData[i]).concat("\n");
             }
        } catch(Exception e){
        }
        headerData = headerData.substring(0,headerData.length()-1);
        return  headerData;
    }
}