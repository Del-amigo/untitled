package Day32;

public class Task {
    static int age = 0;

    public Task() {
        age++;
    }

    public String toString() {
        return "Age: " + age;
    }

    public static void main(String[] args) {
      Task task = new Task();
        System.out.println(task);
         new Task();
        new Task(); //becouse it's class member field and it saves the previous result and changes to new one...
        new Task();
        System.out.println(new Task());

    }
}
