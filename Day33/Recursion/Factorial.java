package Day33.Recursion;

public class Factorial {
    public static void main(String[] args) {

    }
    static int factor(int num){
      if(num <= 1){
          return 1;
      }else
      return num*factor( num-1 ); ///
    }


}
