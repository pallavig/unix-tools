package pallavig.unixtools.sort;


public class SortOptionProcessor {
    private String filename;
    private boolean isReverse = false;
    private String delimiter;
    private int fieldNumber = 1;

    public String getFilename() {
        return filename;
    }

    public boolean getIsReverse() {
        return isReverse;
    }

    public int getFieldNumber() {
        return fieldNumber;
    }
    public String getDelimiter() {
        return delimiter;
    }
    public SortOptionProcessor(String[] args){
        for (int i = 0; i < args.length; i++) {
            if(args[i].equals("-r"))
                isReverse = true;
            if(args[i].startsWith("-f"))
                fieldNumber = Integer.parseInt(args[i].substring(2));
            if(args[i].startsWith("-d"))
                delimiter = args[i].substring(2);
            else
                filename = args[i];
        }
        if(delimiter == null)
            delimiter = " ";
    }
}
