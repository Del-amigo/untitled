package Day43;

public class Inheritance_Mentoring {
}
    class SuperClass{ ////////////Father
        int age;
        String name;
        public String toString(){
            return "Hi";
        }

//        public SuperClass(int age, String name) {
//            this.age = age;
//            this.name = name;
//        }

    }
    class SubClass1 extends SuperClass{ //////////Son
//        public SubClass1(int age, String name) {
//            super( age,name );
//        }

        public static void main(String[] args) {
        SubClass1 subClass1 = new SubClass1();
        }
    }
abstract class abstractSuperClass{

    public double num(){
     return 0.05;
    }

}

class subClass extends abstractSuperClass implements superInterface1, superInterface2{
   public double num(){
       return 0;
   }
}

interface superInterface1{

}
interface  superInterface2{

}