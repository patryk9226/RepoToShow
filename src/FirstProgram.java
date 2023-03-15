import java.util.Scanner;

public class FirstProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze, podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();

        System.out.println("Prosze, podaj drugą liczbe");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float firstNumberFloat = new Float(firstNumber);
        float division = firstNumberFloat / secondNumber;
        int mod = secondNumber % firstNumber;

        System.out.println("Suma podanych liczb to: " + addition);
        System.out.println("Różnica podanych liczb to: " + subtraction);
        System.out.println("Iloczyn podanych liczb to: " + multiplication);
        System.out.println("Iloraz podanych liczb to: " + division);
        System.out.println("Modal podanych liczb to: " + mod);
    }
}
