package pallavig.unixtools.cut;

public class CutOptionProcessor {
    public String getFileName() {
        return fileName;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public int[] getFieldNumbers() {
        return fieldNumbers;
    }

    private String fileName;
    private String delimiter;
    private int[] fieldNumbers = {1};
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