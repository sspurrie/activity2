import java.util.*;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first grade number");
        int first = in.nextInt();
        System.out.println("Enter your second grade number");
        int second = in.nextInt();
        System.out.println("Enter your third grade number");
        int third = in.nextInt();
        double average = (first + second + third) / 3.0;
        if(average >= 90){
            System.out.println("A");
        }
        else if(average < 90 && average >= 80){
            System.out.println("B");
        }
        else if(average < 80 && average >= 70){
            System.out.println("C");
        }
        else if(average < 70 && average >= 60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}
