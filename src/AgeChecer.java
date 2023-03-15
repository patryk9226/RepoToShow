import java.util.Scanner;

public class AgeChecer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze, podaj swój wiek");
        int age = scanner.nextInt();

        if(age < 0){
            System.out.println("Błędnie podany wiek!");
        }else if(age < 18){
            System.out.println("Przykro mi ale jesteś niepełnoletnie, nie mogę sprzedać Ci alkocholu!?");
        }else{
            System.out.println("Dziękuję, co podać?");
        }
    }
}
