public class Main {
    public static void main(String[] args) {

        String[] movies = {
            "Inception",
            "Interstellar",
            "Avengers",
            "Spider-Man",
            "The Matrix"
        };

        int r = (int)(Math.random()*movies.length);

        System.out.println("Movie recommendation: " + movies[r]);
    }
}