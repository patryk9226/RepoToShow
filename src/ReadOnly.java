public class ReadOnly {

    private String name = "Patyk";

    //pierwsza metoda geter, pobieranie watosci z pól prywatnych
    /*public String getName() {
        return name = name + "jest ok";
    }*/

    //druga metoda seter, ustawienie warto\sci pola prywatnego
    /*public void setName(String name) {
        this.name = name;
    }*/

    //Inteligej przyspiesza ustawienie setera i getera poprzez Alt+Insert
    // i wybieramy stter albo getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
