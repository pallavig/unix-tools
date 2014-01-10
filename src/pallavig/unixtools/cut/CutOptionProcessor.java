package pallavig.unixtools.cut;

public class CutOptionProcessor {
    public String fileName;
    public int fieldNo;
    public String delimiter;

    private boolean isSpecifiedOption(String option, String arg) {
        return arg.startsWith(option);
    }

    public CutOptionProcessor(String[] args) {
        delimiter = "\t";
        String delimiterOption = "-d";
        String fieldOption = "-f";
        for (int i = 0; i < args.length; i++) {
            if (isSpecifiedOption(delimiterOption, args[i])) {
                delimiter = args[i + 1];
                continue;
            }
            if (isSpecifiedOption(fieldOption, args[i])) {
                fieldNo = Integer.parseInt(args[i + 1]);
                continue;
            }
            fileName = args[i];
        }
    }

//    public static void main(String[] args) {
//        String[] arg = {"-f","1","a.txt"};
//        CutOptionProcessor cop = new CutOptionProcessor(arg);
//        System.out.println(cop.delimiter);
//        System.out.println(cop.fieldNo);
//        System.out.println(cop.fileName);
//    }
}