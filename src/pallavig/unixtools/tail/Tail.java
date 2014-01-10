package pallavig.unixtools.tail;

public class Tail {
    private String data;
    private int numberOfRows;
    public Tail(String fileData,int requiredNumberOfRows){
        numberOfRows = requiredNumberOfRows;
        data = fileData;
    }
    public String getLines(){
        StringBuilder sb = new StringBuilder();
        String[] linesInData = data.split("\n");
        int counter = (linesInData.length)-numberOfRows;
        if(linesInData.length < numberOfRows)
            return data;
        while(counter < linesInData.length){
            sb.append(linesInData[counter]).append("\n");
            counter++;
        }
        return sb.toString().substring(0,sb.length()-1);
    }
}
