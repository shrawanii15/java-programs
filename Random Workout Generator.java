public class Main {
    public static void main(String[] args) {

        String[] workout = {
            "10 Pushups",
            "20 Squats",
            "30 Jumping Jacks",
            "15 Situps"
        };

        int r = (int)(Math.random()*workout.length);

        System.out.println("Today's workout: " + workout[r]);
    }
}