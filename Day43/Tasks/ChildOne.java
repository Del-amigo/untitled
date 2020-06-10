package Day43.Tasks;

public class ChildOne extends Parent {
    private final int age;

    public ChildOne(String lastname, boolean shapeOfNose, int age) {
        super( lastname, shapeOfNose );
        this.age = age;
    }



    public static void main(String[] args) {
      ChildOne childOne = new ChildOne( "Jumaev", true,15 );
        System.out.println(childOne );
    }
}
