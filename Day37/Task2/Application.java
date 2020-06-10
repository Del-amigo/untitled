package Day37.Task2;

public class Application {
    public static void main(String[] args) throws Exception {
        CarPurchase carPurchase = new CarPurchase();
        carPurchase.buy( Condition.NEW );
        try {
            carPurchase.drive( "meteor shower" );
        }catch (RuntimeException exception){
            System.out.println(exception.getMessage());
        }
    }

}
