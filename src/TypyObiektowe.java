public class TypyObiektowe {
    public static void main(String[] args) {
        // liczby stałoprzecinkowe
        Byte firstNumber = 127; // 1 bajt -128 do 127
        Short secondNumber = 32689; // 2 bajty -32768 do 32767
        Integer thirdNumber = 32768999; // 4 bajty -2 147 483 648 do 2 147 483 647
        Long fourthNumber = 2148000L; // 8 bajtów -2^63 do (2^63)-1

        //liczby zmiennoprzecinkowe na końcu literka F/D lub jak wyżej L
        Float fifthNumber = 4.99934F; // 4 bajty - max ok 6-7 liczb po przecinku
        Double sixthNumber = 399999999999999D; // 8 bajtów - mac ok 15 cyfr po przecinku

        //wartości logiczna
        Boolean prada = true;
        Boolean falsz = false;

        //pojedynczy znak w pojedynczym cudzysłowiu
        Character letter = 'A';

        //ciągi znaków w podwójnym cudzyłowiu
        String hello = "Hello Patryk";

        System.out.println(hello.charAt(0));


    }


}
