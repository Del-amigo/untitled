package HomeworksRepl.ClassAndTryCatch;

public class ClassObjects1 {
    /*
    Main class{

     Create a method name is result()
    This method has 3 int as parameters
    Inside result method, call method average in the Calculation class using by 3 int as parameters

     Inside result method, call method examResult in the Calculation class using by number from the
      average method as int parameter

    If the result from examResult is = A++ or A
    Return "Your result is good and it is A++ You passed Yeayyy" or "Your result is good and it is A You passed Yeayyy"

    If the result from examResult is = B++ or B
    Return "Your result is okay and it is B++ You passed Yeayyy" or "Your result is okay and it is B You passed Yeayyy"

    If the result from  examResult is = C
    Return "Your result could be better but you passed and it is C"

    If the result from  examResult is = F
    Return "Your result is Not good enough it is F . See you next year bro."

}

Calculation Class{
1) Create a method name is average
parameter is 3 int
return type is int
this method return the average of 3 numbers
2) Create a method name is examResult
Parameter is 1 int num
if the num less then or equal to 100 and bigger equal to 90
return is A++
if the num less then 90 and bigger equal to 70
return is A
if the num less then 70 and bigger equal to 60
return is B++
if the num less then 60 and bigger equal to 50
return is B
if the num less then 50 and bigger equal to 40
return is C
if the num less then 40 and bigger equal to 0
return F
if the num less then 0 and more then 100
return This is not a valid input

     */
}
class Main1 {
   public static String result(int a, int b, int c){
           int average = Calculation.average(a, b, c);
            String examResult= Calculation.examResult(average);
            if(examResult.equals("A++")){
                return "Your result is good and it is A++ You passed Yeayyy";
            }else if(examResult.equals("A")){
                return "Your result is good and it is A You passed Yeayyy";
            }else if(examResult.equals("B++")){
                return "Your result is okay and it is B++ You passed Yeayyy";
            }else if(examResult.equals("B")){
                return "Your result is okay and it is B You passed Yeayyy";
            }else if (examResult.equals("C")){
                return "Your result could be better but you passed and it is C";
            }else if (examResult.equals("F")){
                return "Your result is Not good enough it is F . See you next year bro.";

            }
       return examResult;
   }

}


class Calculation{
   public static String examResult(int num){
        if(num<=100 && num >=90){
            return "A++";
        }else if (num<90 && num>=70){
            return "A";
        }else if(num<70 && num>=60){
            return "B++";
        }else if (num<60 && num>=50){
            return "B";
        }else if(num<50 && num>=40){
            return "C";
        }else if (num<40 && num>=0){
            return "F";
        }else {
            return "This is not a valid input";
        }
    }

    public static int average(int one, int two, int three){
       return (one+two+three)/3;
    }
}
