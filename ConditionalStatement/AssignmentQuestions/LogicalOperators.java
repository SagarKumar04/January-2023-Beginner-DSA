package ConditionalStatement.AssignmentQuestions;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a <= 10 && b >= 10) {
            System.out.print("true ");
        }
        else {
            System.out.print("false ");
        }

        if(a % 2 == 0 || b % 2 == 0) {
            System.out.print("true ");
        }
        else {
            System.out.print("false ");
        }

        if(a != b) {
            System.out.print("true ");
        }
        else {
            System.out.print("false");
        }
    }
}
