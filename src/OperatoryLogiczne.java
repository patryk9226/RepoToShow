public class OperatoryLogiczne {

    public static void main(String[] args) {

        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;
        //zamiast true false można dać np 2>1 lub 2<1

        // && -> true wtedy gdzy wyrażenia składowe są równe true
        System.out.println(firstValue && secondValue); // f
        System.out.println(firstValue && fourthValue); // t
        System.out.println(secondValue && thirdValue); // f

        // || lub -> true gdy jedno z wyrażenie skłądowe jest róne true
        System.out.println(firstValue || secondValue); // t
        System.out.println(secondValue || thirdValue); // f
        System.out.println(firstValue || firstValue); // t

        // ! negacja -> zwraca wartość przeciną do wyrażenia przed którym suię znajduje
        System.out.println(!fourthValue); // f
        System.out.println(!secondValue); // t
        System.out.println(!(firstValue && secondValue)); // !(f) t
    }
}
