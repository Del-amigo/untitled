package OCA_Prep;

public class Ex1 {
    public static void main(String[] args) {
        Boolean[] booleans = new Boolean[2];
        booleans[0] = new Boolean( Boolean.parseBoolean( "true" ) );
        booleans[1] = new Boolean( null );
        System.out.println(booleans[0]+ " "+booleans[1]);
    }
}

//     true false