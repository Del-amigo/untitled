package MentoringFromIbrahim;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String text="Amity";
        text=text.replace("","-");
        text=text.substring(1).substring(0,text.length()-2);
        System.out.println(text);
    }
}
