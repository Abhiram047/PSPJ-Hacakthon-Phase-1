import java.util.Scanner;
// Methods
public class Hackathon1c {

    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        System.out.print("Enter morning water usage in litres: ");
        int morningUsage = hi.nextInt();

        System.out.print("Enter evening water usage in litres: ");
        int eveningUsage = hi.nextInt();

        int total = calculateTotal(morningUsage, eveningUsage);

        System.out.println();
        System.out.println("Morning usage (litres): " + morningUsage);
        System.out.println("Evening usage (litres): " + eveningUsage);
        System.out.println("Total water consumption (litres): " + total);

        hi.close();
    }
}