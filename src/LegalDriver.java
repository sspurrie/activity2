import java.util.*;

public class LegalDriver {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = in.nextInt();
        System.out.println("You have a valid driver's license (true or false)");
        boolean answer = in.nextBoolean();
        if (age > 14 && answer){
            System.out.println("You are a legal driver");
        }
        else{
            System.out.println("You are not a legal driver");
        }
    }
}
