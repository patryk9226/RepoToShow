package identifiers.secound;

import identifiers.first.Parent;

public class Child extends Parent {

    //klasa potomna w innej paczce nie ma dostępu do pól/metod privat
    // oraz defoult czyli bez idnetyfikatora oraz proteccted

    public void ttestIdentifiers() {
        System.out.println(first);
        //System.out.println(second);
        System.out.println(third);
        //System.out.println(fourth);
        firstmethod();
        //secondmethod();
        thirdmethod();
        //fourthmethod();
    }
}
