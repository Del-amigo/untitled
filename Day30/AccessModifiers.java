package Day30;

import java.text.DecimalFormat;
import java.util.HashSet;

public class AccessModifiers {
    //Access Modiriers**

    // Modifiers - >> 1. Non.Access Modifiers (final, static)
    //                2.Access Modifiers(public,protected,default,private)

    // clases can be either public or default

    public static void main(String[] args) {
  //      System.out.println(stateTax( "35,6.1$" ));
    }

 double stateTax(String str){ //defoult accessible just within the Same Package only***
     str = str.replace( "$","" );
     str = str.replace( ",","" );

     double number = Double.parseDouble( str );
     double result = number*0.0775;
      DecimalFormat df = new DecimalFormat("#.##");
      String formatted = df.format(result);
           return Double.parseDouble( formatted );
  }
protected HashSet<String> britToAmerican(HashSet<String> set,String colour1, String colour2){
    for (String str:set){
        if(str.equalsIgnoreCase( colour1 ) ){
      str = colour2;
        }
    }
    return set;
}
}
