public class FinalTest {

    //final ustala stałą wartośc dla dnej zmiennej nie można
    // jej zminić w prypadku metody nie można dopisac nowego obiektu

    public static void main(String[] args) {
        final int x =2;

        final Person person = new Person("Tim", 26);
        person.age = 25;
        //person = new Person("Adam", 22);

    }
}
