package Day19;

public class Task5 {
    public static void main(String[] args) {
        String name = "Ajinabek";
        System.out.println(length(name));
        System.out.println(interest(1000,2,3));
        System.out.println("----------------------");
        System.out.println(vowels("UmarJon"));

    }
    public static int length(String a){
        return a.length();
    }
    public static double interest(int money, double percentage, int month){
        return money*(percentage/100)*month+money;
    }
    public static int vowels(String a){
        int counter =0;
        a=a.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='u'|| a.charAt(i)=='y'
                    || a.charAt(i)=='o'){
                counter++;
            }
        }
        return counter;
    }
}
