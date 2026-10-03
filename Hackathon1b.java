import java.util.Scanner;
// If-Else Condition
public class Hackathon1b {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        System.out.print("Enter water consumption in litres: ");
        double waterConsumed = hi.nextDouble();

        int bill;

        if (waterConsumed <= 500) {
            bill = 100;
        }
        else {
            bill = 200;
        }

        System.out.println();
        System.out.println("Water consumed (litres): " + waterConsumed);
        System.out.println("Water bill: Rs." + bill);

        hi.close();
    }
}