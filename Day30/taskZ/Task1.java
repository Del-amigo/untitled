package Day30.taskZ;

class Bank{
    String name;
    String address;
    int phoneNumber;

    public Bank() {
        name = "Unknown";
        address = "TJ";
        phoneNumber = 50045548;
    }

    public void print(String name, String address, int phoneNumber){
       this.name = name;
       this.address = address;
       this.phoneNumber= phoneNumber;
    }
    public Bank(int serial, String name, String address){
        this();
    }
    public Bank(String abs){
        this(132,"Behruz", "Chashmassor");
        String lName;
    }
}
public class Task1 {
    public static void main(String[] args) {
        Bank bankOne = new Bank();
        bankOne.print("HalIk", "KZ", 267256626);
        Bank bankTwo = new Bank();
        bankTwo.name = "Jengo";
        Bank bankThree = new Bank();
bankThree.address = "sdfsdf";
        Bank bankFour = new Bank();
        bankFour.phoneNumber = 21684548;
    }
}
