package Day36;

public class TryCatchEx1 {

    public static void main(String[] args) {

        int a = 5;
        int b = 0;
   try {
       System.out.println( a / b );
   }catch (Exception exception){
       System.out.println("smthng gone wrong, please look to variables");
   }
        System.out.println("End of code");
        //To avoid an Exceptions we need try/catch
    }
}
