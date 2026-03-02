public class QuoteGenerator {
    public static void main(String[] args) {
        String[] quotes = {
            "Keep going!",
            "Believe in yourself!",
            "Stay consistent!"
        };
        int r = (int)(Math.random() * quotes.length);
        System.out.println(quotes[r]);
    }
}