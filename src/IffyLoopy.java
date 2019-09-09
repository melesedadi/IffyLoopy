import java.util.Scanner;

public class IffyLoopy {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String answer = "y";
        boolean answer2 = true;

        while ((answer.equalsIgnoreCase("yes")) || (answer.equalsIgnoreCase("y"))) {
            System.out.println("Are your eyes red?: ");
            answer = key.nextLine();
            if ((answer.equalsIgnoreCase("yes")) || (answer.equalsIgnoreCase("y"))) {
                answer2 = true;
            } else {
                answer2 = false;
            }

            if (answer2 == true) {
                System.out.println("Get some sleep!");
            } else {
                System.out.println("You look great!");
            }

            System.out.println("Do you want to try again? ");
            answer = key.nextLine();
        }
        System.out.println("Goodbye then!");
    }
}