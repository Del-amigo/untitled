package Day44.TaskZ;

public class Student extends Person {
    private School school;
    private double fee;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
             //   "school=" + school +
                ", fee=" + fee +
                ", name="+ getName()+
                ", address="+ getAddress()+
                '}';
    }

    public static void main(String[] args) {

    }
}
