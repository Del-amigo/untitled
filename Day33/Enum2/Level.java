package Day33.Enum2;

public enum Level {

    HIGH(1),
    MEDIUM(2),
    LOW(3);

    public int levelnumber;

    Level(int i) {
        levelnumber = i;
    }

    enum StudentGrade{
        FAIL("F"),
        PASS("P");

        public String gradeLetter;

        StudentGrade (String p){
            gradeLetter = p;
        }
    }
}
