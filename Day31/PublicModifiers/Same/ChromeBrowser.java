package Day31.PublicModifiers.Same;

public class ChromeBrowser {
    public static void main(String[] args) {
        SerachEngine serachEngine = new SerachEngine( "GooGle" );
        System.out.println(serachEngine);

        serachEngine.name = "Explorer";
    }
}
