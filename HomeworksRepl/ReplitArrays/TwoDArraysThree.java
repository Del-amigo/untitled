package HomeworksRepl.ReplitArrays;

import java.util.Arrays;

public class TwoDArraysThree {
    /*

Create a 2D String Array which is
[{"new jersey","atlanta","ohio"} ,
{"Pittsburgh" ,"ohio","new york","ohio"} ,
{"ohio","new york"}]
Change all the ohio to Florida
print the array
     */
    public static void main(String[] args) {
        String[][] states = {     {"new jersey","atlanta","ohio"} ,
                            {"Pittsburgh" ,"ohio","new york","ohio"},
                                      {"ohio","new york"}             };
        for (int i = 0; i <states.length; i++) {
              for(int j=0; j<states[i].length; j++){
                      System.out.println(states[i][j].replace("ohio", "Florida"));
                  }
              }
        }
    }
