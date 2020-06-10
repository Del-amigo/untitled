package Day32.StaticModifiers;

import java.util.Arrays;

public class Task {
   final String[] month = {"January","Febuary","March","April","May","June","Jyly","August",
                             "September","October","November","December"};

  final String name = "Behruz";

//    public String toString() {
//        return "month=" + Arrays.toString( month );
//    }
//    public void print(){
//        System.out.println( Arrays.toString( month ) );
//    }

    public static void main(String[] args) {
        Task task = new Task();
        System.out.println( Arrays.toString( task.month ) );
        task.month[0] = "Eshkere";//Especially if it's final U can't change/reassighn, but here U can change just an index
        System.out.println( Arrays.toString( task.month ) );

        String replace = task.name.replace( "B", "Z" );
        System.out.println(replace);
    }

}
