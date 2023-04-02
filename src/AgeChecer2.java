import exceptions.InvalidAgeException;

import java.util.Scanner;

public class AgeChecer2 {

    public static void main(String[] args) throws InvalidAgeException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze, podaj swój wiek");
        int age = scanner.nextInt();

        if(age < 0) {
            throw new InvalidAgeException("Your number is not valid");
        }
        if(age >= 18) {
            System.out.println("Jesteś pełnoletni");
        } else {
            System.out.println("Nie jesteś pełnoletni");
        }
    }
}
