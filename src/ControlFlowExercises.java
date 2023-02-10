import java.sql.SQLOutput;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        Loop Basics - Do-While Loop

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Fuzz");
            } else System.out.println(i);
        }

    }
}
