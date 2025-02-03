import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current permissions (0-15): ");
        int permissions = scanner.nextInt();

        System.out.print("Enter the bit position to toggle (0-3): ");
        int position = scanner.nextInt();

        if (permissions < 0 || permissions > 15 || position < 0 || position > 3) {
            System.out.println("Invalid input. Please enter a valid permission (0-15) and position (0-3). ");
            return;
        }

        System.out.println(
                "Original permissions: " + String.format("%4s", Integer.toBinaryString(permissions)).replace(' ', '0'));

        int updatedPermissions = permissions ^ (1 << position);

        System.out.println("Updated permissions: "
                + String.format("%4s", Integer.toBinaryString(updatedPermissions)).replace(' ', '0'));

        scanner.close();
    }
}
