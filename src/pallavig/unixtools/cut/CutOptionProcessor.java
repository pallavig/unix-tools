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
                delimiter = args[i].substring(2);
                continue;
            }
            if (isSpecifiedOption(fieldOption, args[i])) {
                String fields = args[i].substring(2);
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
}