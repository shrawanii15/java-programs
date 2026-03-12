public class Main {
    public static void main(String[] args) {

        String[] fortunes = {
            "You will become a great programmer.",
            "Something exciting will happen today.",
            "You will learn a new skill soon.",
            "Good luck is coming your way."
        };

        int r = (int)(Math.random()*fortunes.length);
        System.out.println("Your fortune: " + fortunes[r]);
    }
}