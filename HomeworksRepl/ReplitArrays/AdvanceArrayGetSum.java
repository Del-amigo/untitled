package HomeworksRepl.ReplitArrays;

public class AdvanceArrayGetSum {
    /*
Create a String "$12 $23 $10 $2 $5 $2"
remove the $ sign and sum all the numbers
print the total of the numbers
     */
    public static void main(String[] args) {
        String strings = "$12 $23 $10 $2 $5 $2";
// String replace=strings.replace("$","");
     int num7=Integer.parseInt(strings.substring(1,3));
        int num8=Integer.parseInt(strings.substring(5,7));
        int num9=Integer.parseInt(strings.substring(9,11));
        int num10=Integer.parseInt(strings.substring(13,14));
        int num11=Integer.parseInt(strings.substring(16,17));
        int num12=Integer.parseInt(strings.substring(19,20));
int total = num7+num8+num9+num10+num11+num12;
        System.out.println(total);
        }
            }