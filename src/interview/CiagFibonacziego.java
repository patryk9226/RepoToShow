package interview;

public class CiagFibonacziego {

    public static void main(String[] args) {
        fibo(1);
        fibo(2);
        fibo(3);
        fibo(4);
        fibo(5);
        fibo(6);
    }
    public static void fibo(int n) {
        long x1 = 1;
        long x2 = 1;
        for (int i = 3; i <= n; i++) {
            long temp = x1 + x2;
            x1 = x2;
            x2 = temp;
        }
        System.out.println(x2);
    }
}
