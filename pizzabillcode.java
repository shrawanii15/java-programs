import java.util.Scanner;

public class PizzaBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of pizzas: ");
        int qty = sc.nextInt();

        int price = 200;
        int total = qty * price;

        System.out.println("Total bill = ₹" + total);
        System.out.println("Thank you for ordering!");
    }
}