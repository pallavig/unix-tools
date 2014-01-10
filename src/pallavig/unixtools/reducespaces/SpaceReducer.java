package pallavig.unixtools.reducespaces;

public class SpaceReducer {
    String fileData;

    public SpaceReducer(String fileContent) {
        fileData = fileContent;
    }

    public String reduceSpaces() {
        fileData = fileData.replaceAll(" +", " ");
        return fileData;
    }
}