public class ProgramWypisujacyLiczbyPodzielnePrzez3 {

    public static void main(String[] args) {

        int number = 1;

        while (number < 100) {
            int mod = number%3;
            if (mod == 0) {
                System.out.println("Jestem podzielna przez 3: " + number);
            }
        number++;
        }

    for (int i=1; i<100; i++) {
        if (i%3==0)
            System.out.println("Jestem podzielna przez 3: " + i);
        }

    }
}
