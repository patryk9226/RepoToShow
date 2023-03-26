public class MetodyTest {

    public static void main(String[] args) {
        Metody metody = new Metody();
/*      metody.policzWynik();
        int result = metody.pobierzWynik();
        int result2 = result * 2;
        System.out.println("Rezultat przed monożeniem to: " + result);
        System.out.println("Rezultat po monożeniu to: " + result2);

        metody.policzWynikParam( 2);
        metody.policzWynikParam( 100);
        metody.policzWynikParam( 23);*/

        int result = metody.add(2,3, "Hello");
        System.out.println(metody.add(2,6, "Hello2"));
        System.out.println(result);
    }
}
