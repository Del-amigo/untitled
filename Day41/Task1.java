package Day41;

import java.util.Scanner;

public class Task1 {
    private int roomCount;
    private boolean isBalconyAvailable;
    private int price;

    public void setRoomCount(int roomCount) {
        //roomcount should be 0 or 1;
        if (roomCount > -1 && roomCount < 2) {
            if (roomCount == 0 && !isBalconyAvailable) {
                price += 1000;
            } else if (roomCount == 0) {
                price += 1200;
            } else if (roomCount == 1 && !isBalconyAvailable) {
                price += 1500;
            } else if (roomCount == 1) {
                price += 1700;
                this.roomCount = roomCount;
            } else System.out.println( "Room Count is not valid" );
            this.roomCount = -1;
        }
    }

    public void setBalconyAvailable(boolean balconyAvailable) {
        isBalconyAvailable = balconyAvailable;
    }

    public int getPrice() {
        return price;
    }


    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Scanner scanner = new Scanner( System.in );
        System.out.println("How many rooms, do you prefer? ");
        int roomCount = scanner.nextInt();
        System.out.println("With balcony or without? ");
        boolean balcony = scanner.nextBoolean();
        task1.setRoomCount( roomCount );
        task1.setBalconyAvailable( balcony );
        System.out.println(task1.getPrice());
    }
}
