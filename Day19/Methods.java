package Day19;

public class Methods {
    public static void main(String[] args) {
        System.out.println(muliply(3,5));
        System.out.println(PrintaText("ajinabek"));
    }


    public static int muliply(int a, int b){
        return a*b; //agar void bosha yagon chiza dar main method 1 bor istifoda mebarem
                    //agar return bosha hamuya chand bor metonem faryod knemsha
                    //void means nothin'
    }

public static String PrintaText(String abc){
    return abc;
    }
}
