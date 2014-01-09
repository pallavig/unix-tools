package pallavig.unixtools.head;

public class HeadOptionProcessor {
    public int numberOfRows;
    public String filename;
    public HeadOptionProcessor(String[] args){
        if(args[0].startsWith("-")){
            numberOfRows = Integer.parseInt(args[0].substring(1));
            filename = args[1];
            return;
        }
        numberOfRows = 10;
        filename = args[0];
    }
}


