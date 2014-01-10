package pallavig.unixtools.headtailoptionprocessor;

public class HeadTailOptionProcessor {
    public int numberOfRows;
    public String filename;
    public HeadTailOptionProcessor(String[] args){
        if(args[0].startsWith("-")){
            numberOfRows = Integer.parseInt(args[0].substring(1));
            filename = args[1];
            return;
        }
        numberOfRows = 10;
        filename = args[0];
    }
}