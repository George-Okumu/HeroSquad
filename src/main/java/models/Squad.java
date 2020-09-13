package models;

public class Squad {
    private String squadName;
    private int maxSize;
    private String squadCause;

    public Squad(String squadName, int maxSize, String squadCause) {
        this.squadName = squadName;
        this.maxSize = maxSize;
        this.squadCause = squadCause;
    }

    public String getSquadName() {
        return squadName;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public String getSquadCause() {
        return squadCause;
    }
}
