import java.util.Scanner;

class MessageFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept first and last name
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine().trim();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine().trim();

        // Concatenate with space
        String fullName = firstName + " " + lastName;

        // Display properly formatted name
        System.out.println("Full Name: " + fullName);

        sc.close();
    }
}