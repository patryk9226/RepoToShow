package identifiers.first;

public class Random {

    //klasa w tej samej paczce nie ma dostępu do pól/metod privat

    public void ttestIdentifiers() {

        Parent parent = new Parent();

        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
        //System.out.println(parent.fourth);
        parent.firstmethod();
        parent.secondmethod();
        parent.thirdmethod();
        //parent.fourthmethod();
    }
}
