import java.util.Scanner;

public class CustomScanner {

/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze, podaj swoje imie");
        String name = scanner.nextLine();
        System.out.println("Cześć " + name + "!");
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze, podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        //int resoult = firstNumber * firstNumber;
        System.out.println("Kwadrat tej liczby to: " + firstNumber * firstNumber);
    }
}
