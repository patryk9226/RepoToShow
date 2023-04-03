package sety;

import java.util.HashSet;
import java.util.Set;

public class SetyTest {
    public static void main(String[] args) {
        Set<String> fruts = new HashSet<>();
        fruts.add("apple");
        fruts.add("orange");
        fruts.add("orange"); //nie ma tego elementu bo zbiory/sety nie przyjują zduplikowanych pozycji

        //System.out.println(fruts.contains("apple"));
        //System.out.println(fruts.size());
        //System.out.println(fruts.isEmpty());

        Set<String> vege = new HashSet<>();
        vege.add("potatoes");
        vege.add("onion");

        //System.out.println(vege.size());

        /*for (String fruit : fruts) {
            System.out.println(fruit);
        }
        for (String fruit : fruts) {
            System.out.println(fruit);
        }*/

        Set<String> blonnik = new HashSet<>();
        blonnik.addAll(fruts);
        blonnik.addAll(vege);

        for (String blonnik2 : blonnik) {
            System.out.println(blonnik2);
        }
    }
}
