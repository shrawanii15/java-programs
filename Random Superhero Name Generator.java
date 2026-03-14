public class Main {
    public static void main(String[] args) {

        String[] first = {"Captain", "Dark", "Iron", "Mega"};
        String[] second = {"Tiger", "Shadow", "Storm", "Phoenix"};

        int a = (int)(Math.random()*first.length);
        int b = (int)(Math.random()*second.length);

        System.out.println("Your superhero name: " + first[a] + " " + second[b]);
    }
}