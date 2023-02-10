import java.sql.SQLOutput;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        Loop Basics - Do-While Loop

        long i = 2;

        do {
            System.out.println(i);
            i *= i;
        } while ( i < 1000001 );

    }
}
