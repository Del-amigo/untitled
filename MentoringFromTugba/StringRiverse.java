package MentoringFromTugba;

public class StringRiverse {
    public static void main(String[] args) {

    String[] strArray = {"Mardin", "London", "Atlanta", "Garfield"};

        for(int i=strArray.length-1 ; i>= 0 ; i--){
        System.out.print(strArray[i] + " ");

        char[] ch= strArray[i].toCharArray();  // I am converting each string to char
        for(int j=ch.length-1; j>=0; j--){
            System.out.print(ch[j] + " ");
        }
        System.out.println();
    }
}
}