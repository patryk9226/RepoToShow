public class Calculator {

    public int add(int firstNumber, int secoundNumber) {
        System.out.println("Suma to: " + (firstNumber + secoundNumber));
        return firstNumber + secoundNumber;
    }
    public int sub(int firstNumber, int secoundNumber) {
        System.out.println("Różnica to: " + (firstNumber - secoundNumber));
        return firstNumber - secoundNumber;
    }
    public int multi(int firstNumber, int secoundNumber) {
        System.out.println("Iloczyn to: " + (firstNumber * secoundNumber));
        return firstNumber - secoundNumber;
    }
    public int div(int firstNumber, int secoundNumber) {
        System.out.println("Iloraz to: " + (firstNumber / secoundNumber));
        return firstNumber / secoundNumber;
    }
    public int mod(int firstNumber, int secoundNumber) {
        System.out.println("Reszta z dzielenie to: " + (firstNumber % secoundNumber));
        return firstNumber % secoundNumber;
    }
}
