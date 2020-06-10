package Day15;

public class Archajon {
    public static void main(String[] args) {
        for (int  poyon=0; poyon <= 5; poyon++) {
            for (int baraki = 0; baraki <= 5; baraki++) {
                if(poyon>=baraki){
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
