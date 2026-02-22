import java.util.Scanner;

public class SongMood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mood (happy/sad/chill): ");
        String mood = sc.nextLine();

        if (mood.equals("happy"))
            System.out.println("Play: Party song");
        else if (mood.equals("sad"))
            System.out.println("Play: Sad song");
        else
            System.out.println("Play: Chill lo-fi ");
    }
}