public class Switch {

    public static void main(String[] args) {

        String danie = "inne";

        switch (danie) {
            case "Pizza":
                System.out.println("Cena za " + danie + " to 20 zł");
                // break zatrzymuje switcha
                break;
            case "Losos":
                System.out.println("Cena za " + danie + " to 30 zł");
                break;
            case "Kurczak":
                System.out.println("Cena " + danie + " to 25 zł");
                break;
            default:
                System.out.println("Brak " + danie + " w karcie");
        }
    }
}
