package pallavig.unixtools.cut;

public class CutOptionProcessor {
    public String fileName;
    public int fieldNo;
    public String delimiter;
    public int[] fieldNumbers;
    private boolean isSpecifiedOption(String option, String arg) {
        return arg.startsWith(option);
    }

    public CutOptionProcessor(String[] args) {
        int j = 0;
        delimiter = "\t";
        String delimiterOption = "-d";
        String fieldOption = "-f";
        for (int i = 0; i < args.length; i++) {
            if (isSpecifiedOption(delimiterOption, args[i])) {
                delimiter = args[i + 1];
                continue;
            }
            if (isSpecifiedOption(fieldOption, args[i])) {
                String fields = args[i + 1];
                String[] allfields = fields.split(",");
                fieldNumbers = new int[allfields.length];
                for (String field : allfields) {
                    fieldNumbers[j] = Integer.parseInt(field);
                    j++;
                }
                continue;
            }
            fileName = args[i];
        }
    }
//    public static void main(String[] args) {
//        CutOptionProcessor cut = new CutOptionProcessor(args);
//        System.out.println(cut.fieldNumbers[0] + " " + cut.fieldNumbers[1]);
//        System.out.println(cut.fileName);
//        System.out.println(cut.delimiter);
//    }
}