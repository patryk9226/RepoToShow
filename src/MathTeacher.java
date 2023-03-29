public class MathTeacher extends Person {

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstrukorze mathteacher");
        this.school = school;
    }

    public void teachMath() {
        System.out.println("I am teatcher Math in " + school);
    }
    public void sayHello() {
        System.out.println("Hell, my name is " + name);
        System.out.println("I am " + age);
    }
}
