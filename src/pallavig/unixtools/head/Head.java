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
        String[] linesInData = data.split("\r\n");
        try {
             for (int i = 0; i < numberOfRows; i++){
                 headerData = headerData.concat(linesInData[i]).concat("\r\n");
             }
        } catch(Exception e){
        }
        headerData = headerData.substring(0,headerData.length()-2);
        return  headerData;
    }
}