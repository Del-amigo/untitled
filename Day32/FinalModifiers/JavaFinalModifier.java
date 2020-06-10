package Day32.FinalModifiers;

public class JavaFinalModifier {
/*
finaL**
Attributes and methods cannot be overriden/modified**
 */
    private final int number = 10;// after inializing to final U can't change it any more!!!

    public void print(String string){
      //  this.number = string;--becouse field is final**
    }

    public static void main(String[] args) {
        JavaFinalModifier   javaFinalModifier = new JavaFinalModifier();
    //    javaFinalModifier.number = 10;
     //   javaFinalModifier.number = 20;// so with default we changed the number's value


    }
}
