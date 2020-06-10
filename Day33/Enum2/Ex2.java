package Day33.Enum2;

enum levels {
    LOW, MEDIUM, HIGH;
}

public class Ex2 {

static String[] levels = {"Low", "Medium", "High"};

    public static void main(String[] args) {
        // Basically an Enum is when a Class and an Array have a baby, couse it's a list of values that
        // doesn't change and it's set up like a Class, U can acces it like a class...
        //An Enums can be put inside or outside of a class, why we use Enum--?! we use an Enam for things
        // that does not change
        System.out.println(levels[0]);

        System.out.println( Day33.Enum2.levels.HIGH );
    }
}
