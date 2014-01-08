package pallavig.unixtools.head;

public class Head {
    private String data;
    private int numberOfRows;
    public Head(String fileData){
        numberOfRows = 10;
        data = fileData;
    }
    public String getHeader(){
        String headerData = "";
        String[] linesInData = data.split("\n");
        try {
             for (int i =0;i<10;i++){
                 headerData = headerData.concat(linesInData[i]).concat("\n");
             }
        } catch(Exception e){
        }
        return headerData;
    }
}
