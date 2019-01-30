import java.util.*;

public class Hypotenuse {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter side one");
        int first = in.nextInt();
        System.out.println("Enter side two");
        int second = in.nextInt();
        double hyp = Math.sqrt(Math.pow(first, 2) + Math.pow(second, 3));
        System.out.println(hyp);
    }
}
