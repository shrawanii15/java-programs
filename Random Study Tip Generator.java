public class Main {
    public static void main(String[] args) {

        String[] tips = {
            "Study in 25 minute sessions.",
            "Take short breaks.",
            "Practice coding daily.",
            "Revise before sleeping."
        };

        int r = (int)(Math.random()*tips.length);

        System.out.println("Study Tip: " + tips[r]);
    }
}