import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a whole number");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
