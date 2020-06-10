package Day43.Tasks;

public class ChildTwo extends Parent {
    public ChildTwo(String lastname, boolean shapeOfNose) {
        super( lastname, shapeOfNose );
    }


    public static void main(String[] args) {
        ChildTwo childTwo = new ChildTwo(  "Jumaev", true);
        System.out.println(childTwo);
    }
}
