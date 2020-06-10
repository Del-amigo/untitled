package HomeworksRepl.Encapsulation;

import java.util.Scanner;

class Encapsul {
    /*
    There are two classes one Main and Subscribe
In the Subscribe class
Create variables private String name , whichTypeOfMember
Create variables private int memberCount , price
Variable types of name , memberCount  and whichTypeOfMember as just write-only.
Make the price as just read-only.
There are 3 type of memberShip Gold  , Silver and Bronze.
Create a toString method. And do following example.

Example:
Name is Victoria , whichTypeOfMember Gold, memberCount 2.
Gold membership count is 50 for month.
Print Welcome to membership Victoria. Your membership is 100 dollar for month you can enjoy the videos , all
 homework and see you soon.

Name is Rinda , whichTypeOfMember Silver, memberCount 3.
Silver membership count is 40 for month.
print Welcome to membership Rinda. Your membership is 120 dollar for month you can enjoy the videos.

Name is Steven, whichTypeOfMember Bronze , memberCount 1.
Bronze membership count is 30 for month.
print Welcome to membership Steven. Your membership is 30 dollar for month you can enjoy and all homework.

Note: Price calculation should be done in the getPrice method.

In the Main class.
Call the setter methods in the subscribe class.

While calling the setName method use variable name in line 10.
Same for whichMember and memberCount variables.
print the Subscribe Object.
     */
}
class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String  whichMember = scan.nextLine();
        int memberCount = scan.nextInt();

//  DONT CHANGE THE CODE BEFORE THIS LINE AND USE THESE VARIABLES WHILE SETTING THE SETTER IN EMPLOYEES CLASS
      Subscribe subscribe = new Subscribe();
      subscribe.setName( name );
      subscribe.setWhichTypeOfMember( Encapsul3.valueOf( whichMember ) );
      subscribe.setMemberCount( memberCount );
    }
}

class Subscribe{
private String name;
private Encapsul3 whichTypeOfMember;
private int memberCount;
private double price;

    Subscribe(Encapsul3 whichTypeOfMember) {
        this.whichTypeOfMember = whichTypeOfMember;
    }

    public Subscribe() {

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setWhichTypeOfMember(Encapsul3 whichTypeOfMember) {
        this.whichTypeOfMember = whichTypeOfMember;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Subscribe{" +
                "name='" + name + '\'' +
                ", whichTypeOfMember=" + whichTypeOfMember +
                ", memberCount=" + memberCount +
                ", price=" + price +
                '}';
    }
}
public enum Encapsul3 {
    GOLD(50), SILVER(40), BRONZE(30);
    private final int symbol;

    Encapsul3(int member){
        this.symbol = member;
    }
    public int getMember(){
        return symbol;
    }
    }
