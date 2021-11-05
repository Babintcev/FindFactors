import java.util.Scanner;

public class FindFactors {

    public static void main(String[] args) {

        System.out.println("Enter the integer number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(
                        "Factor: " + i + "  (" + i + " x " + number/i + " = " + number + ")"
                );
                count++;
            }
        }
        System.out.println(
                "There are " + count + " factors in the number " + number + "!"
        );
    }
}