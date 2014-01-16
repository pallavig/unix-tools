package pallavig.unixtools.sort;

import pallavig.unixtools.cut.Cut;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Sort implements Comparator<String>{
    String fileData;
    boolean isReverse;
    int fieldNumber;
    String delimiter;

    public Sort(String fileData,int fieldNumber,boolean isReverse,String delimiter){
        this.fileData = fileData;
        this.fieldNumber = fieldNumber;
        this.isReverse = isReverse;
        this.delimiter = delimiter;
    }

    public String sortData(){
        String[] linesInData;
        String fieldData;
        StringBuilder sb = new StringBuilder();
        linesInData = fileData.split("\n");
        Arrays.sort(linesInData,this);
        if(isReverse)
            Collections.reverse(Arrays.asList(linesInData));
        for (int i = 0; i < linesInData.length; i++) {
            sb.append(linesInData[i]).append("\n");
        }
        return sb.toString();
    }


    @Override
    public int compare(String o1, String o2) {
        int field = fieldNumber;
        String[] fields1 = o1.split(delimiter);
        String[] fields2 = o2.split(delimiter);
        int res = 0;
        while(res == 0){
            res = fields1[field-1].compareTo(fields2[field-1]);
            if(res == 0)
                field++;
        }
        return res;
    }
}