public class Main {
    public static void main(String[] args) {

        String[] colors = {"Red", "Blue", "Green", "Yellow", "Black"};

        int r = (int)(Math.random() * colors.length);
        System.out.println("Random Color: " + colors[r]);
    }
}