package identifiers.secound;

import identifiers.first.Parent;

public class Random {

    //klasa w innej paczce nie ma dostępu do pól/metod privat oraz defoult czyli bez idnetyfikatora

    public void ttestIdentifiers() {

        Parent parent = new Parent();

        System.out.println(parent.first);
        //System.out.println(parent.second);
        //System.out.println(parent.third);
        //System.out.println(parent.fourth);
        parent.firstmethod();
        //parent.secondmethod();
        //parent.thirdmethod();
        //parent.fourthmethod();
    }
}
