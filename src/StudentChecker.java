import java.util.Scanner;

public class StudentChecker {

    public static void main(String[] args) {

        Student adam = new Student();
        adam.imie = "Adam";
        adam.nazwisko = "Badura";
        adam.nick = "ADABAD";
        adam.email = "adambadura@wp.pl";
        adam.numerIndeksu = 11111;

        Student kasia = new Student();
        kasia.imie = "Kasia";
        kasia.nazwisko = "Badura";
        kasia.nick = "KASBAD";
        kasia.email = "kasiabadura@wp.pl";
        kasia.numerIndeksu = 11112;

        Student piotr = new Student();
        piotr.imie = "Piotr";
        piotr.nazwisko = "Badura";
        piotr.nick = "PIOBAD";
        piotr.email = "piotrbadura@wp.pl";
        piotr.numerIndeksu = 11113;

        Student[] students = new Student[3];
        students[0] = adam;
        students[1] = kasia;
        students[2] = piotr;

        for (int i = 0; i < students.length; i++){
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNrIndeksu();
            students[i].zalogujSie();
        }
    }
}
