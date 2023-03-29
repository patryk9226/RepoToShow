public class Footballer extends Person {

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        System.out.println("Jestem w konstrukorze footballer");
        this.footballClub = footballClub;
    }

    public void playFpptball() {
        System.out.println("I am footballer for " + footballClub);
    }
    public void sayHello() {
        System.out.println("Hell, my name is " + name);
        System.out.println("I am " + age);
    }
}
