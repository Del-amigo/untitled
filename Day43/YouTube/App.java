package Day43.YouTube;

public class App {
    public static void main(String[] args) {
        Chef chef = new Chef();
        chef.makeChicken();

        ItalianChef italianChef = new ItalianChef();
        italianChef.makeSpaghetty();

        ChineeseChef chineeseChef = new ChineeseChef();
        chineeseChef.makeFrogs();
    }
}
