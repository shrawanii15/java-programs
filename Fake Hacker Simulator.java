public class Main {
    public static void main(String[] args) throws InterruptedException {

        String[] steps = {
            "Connecting to server...",
            "Bypassing security...",
            "Accessing database...",
            "Downloading files...",
            "Hack complete!"
        };

        for(String s : steps){
            System.out.println(s);
            Thread.sleep(1000);
        }
    }
}