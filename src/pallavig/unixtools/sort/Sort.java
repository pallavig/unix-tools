package pallavig.unixtools.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Sort{
    String fileData;
    boolean isReverse;

    public Sort(String fileData) {
        this.fileData = fileData;
        this.isReverse = false;
    }

    public Sort(String fileData,boolean isReverse) {
        this.fileData = fileData;
        this.isReverse = isReverse;
    }

    public static Comparator<String> StringComaprator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    };

    public static Comparator<String> StringReverseComparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    };

    public String sortData(){
        String[] linesInData;
        StringBuilder sb = new StringBuilder();
        linesInData = fileData.split("\n");
        if(isReverse)
            Arrays.sort(linesInData,Sort.StringReverseComparator);
        else
            Arrays.sort(linesInData,Sort.StringComaprator);
        for (int i = 0; i < linesInData.length; i++) {
            sb.append(linesInData[i]).append("\n");
        }
        return sb.toString();
    }
}
