import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string of text: ");
        String text = in.nextLine();
        System.out.print("Enter an integer: ");
        int number = in.nextInt();
        System.out.print("Enter an double: ");
        double number2 = in.nextDouble();
        System.out.print("Enter a boolean value: ");
        boolean bool = in.nextBoolean();
        System.out.print("Your string is " + text + "\n");
        System.out.print("Your integer is " + number + "\n");
        System.out.print("Your double is " + number2 + "\n");
        System.out.print("Your bool is " + bool + "\n");
    }
}
