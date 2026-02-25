import java.util.Scanner;

public class FunName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Your superhero name: Captain " + name);
        System.out.println("Your villain name: Dark " + name);
        System.out.println("Your robot name: " + name + "-3000");
    }
}