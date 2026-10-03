import java.util.Scanner;
//DataTypes
public class Hackathon1a {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        System.out.print("Enter the number of family members: ");
        int familyMembers = hi.nextInt();

        System.out.print("Enter water consumed in litres: ");
        double waterConsumed = hi.nextDouble();

        System.out.print("Enter house number: ");
        int houseNumber = hi.nextInt();

        System.out.print("Enter water usage status (single character): ");
        char usageStatus = hi.next().charAt(0);

        System.out.println();
        System.out.println("Number of family members: " + familyMembers);
        System.out.println("Water consumed (litres): " + waterConsumed);
        System.out.println("House number: " + houseNumber);
        System.out.println("Water usage status: " + usageStatus);

        hi.close();
    }
}