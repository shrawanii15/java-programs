import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter birth year: ");
        int birth = sc.nextInt();

        int age = 2026 - birth;
        System.out.println("Your age is: " + age);
    }
}