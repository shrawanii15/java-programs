public class Main {
    public static void main(String[] args) {

        String[] comp = {
            "You are amazing!",
            "You code like a pro!",
            "You will do great things!",
            "Your future is bright!"
        };

        int r = (int)(Math.random()*comp.length);

        System.out.println(comp[r]);
    }
}