import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze, podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Prosze, podaj drugą liczbe");
        int secoundNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

        int rasultAdd = calculator.add(firstNumber,secoundNumber);
        int rasultSub = calculator.sub(firstNumber,secoundNumber);
        int rasultDiv = calculator.div(firstNumber,secoundNumber);
        int rasultMulti = calculator.multi(firstNumber,secoundNumber);
        int rasultMod = calculator.mod(firstNumber,secoundNumber);
    }
}
