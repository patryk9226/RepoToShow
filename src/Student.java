public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static String nazwaUczelni = "AGH";

    public void przedstawSie() {
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }
    public void zalogujSie() {
        System.out.println("Loguje się z pomocą " + nick);
    }
    public  void  podajNrIndeksu() {
        System.out.println("Mój numer indeksu to: " + numerIndeksu);
    }
    public void podajEmail() {
        System.out.println("Mój email to: " + email);
    }

    public static void infouczelnia() {
        System.out.println("Moja uczelnia to AGH");
        druga();
    }
    public  static void druga() {
        System.out.println("Jestem drugą metodą");
    }
}

