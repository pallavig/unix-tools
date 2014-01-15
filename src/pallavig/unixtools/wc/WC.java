package pallavig.unixtools.wc;

public class WC {
    private String data;

    public WC(String fileData) {
        data = fileData;
    }

    public int countLines() {
        int numberOfLines = data.split("\r\n").length - 1;
        return numberOfLines;
    }

    public int countCharacters() {
        int numberOfCharacters = data.length();
        return numberOfCharacters;
    }

    public int countWords() {
        int numberOfWords = data.split("\\W+").length;
        return numberOfWords;
    }
}