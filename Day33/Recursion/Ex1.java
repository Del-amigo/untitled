package Day33.Recursion;

public class Ex1 {

    static void print1to5(){
        for (int i = 1; i <=5 ; i++) {
            System.out.print(i);
        }
    }
// Recursion means giving a method to itself*

    static  int print1to5(int i){
        System.out.println(i);
        if(i==5){
            return -1;
        }
        return print1to5(++i); // i+1
    }
    public static void main(String[] args) {
      //  print1to5();
      //  print1to5(1);

        int factor = Factorial.factor( 5 );
        System.out.println(factor);
    }
}
