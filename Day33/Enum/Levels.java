package Day33.Enum;

public enum Levels {
    HIGH(1),
    MEIUM(2),
    LOW(3);

    private int intValue;

    Levels(int i) {
        intValue = i;
    }

    public int getIntValue(){
        return intValue;
    }
}
