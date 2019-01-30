import java.util.*;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many hours?");
        int hours = in.nextInt();
        System.out.println("How many minutes?");
        int minutes = in.nextInt();
        System.out.println("How many seconds?");
        int seconds = in.nextInt();
        int total = (hours*3600) + (minutes*60) + seconds;
        System.out.println("Total number of seconds: " + total);
    }
}
