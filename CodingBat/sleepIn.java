package CodingBat;

public class sleepIn {
    /*
    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
     */
    public static void main(String[] args) {
        System.out.println(sleepIn(true,true));
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday){
            return true;
        }else return weekday == vacation;
    }
}
