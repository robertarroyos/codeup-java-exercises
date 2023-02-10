import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        Loop Basics - Do-While Loop

        Scanner input = new Scanner(System.in);
        System.out.print("What number would you like to go up to? ");
        int userNum = input.nextInt();

        System.out.printf(
                "%nHere is your table!%n%nnumber | squared | cubed%n------ | ------- | ------"
        );

        for ( int i = 1; i < userNum + 1; i++ ) {
            int iSq = i * i;
            int iCb = i * i * i;
            System.out.printf(
                    "%n%-7d| %-8d| %d", i, iSq, iCb
            );
        }

    }
}
