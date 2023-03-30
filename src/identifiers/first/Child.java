package identifiers.first;

public class Child extends Parent {

    //klasa potomna w tej samej paczce nie ma dostępu do pól/metod privat

    public void ttestIdentifiers() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        //System.out.println(fourth);
        firstmethod();
        secondmethod();
        thirdmethod();
        //fourthmethod();
    }
}
