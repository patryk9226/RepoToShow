package lambda;

public class StudentTest {
    public static void main(String[] args) {

        Student it = new ItStudent();
        sayHello("John", it, 21);

        Student med = new Student() {
            public void sayHello(String name, int age) {
                System.out.println("I will be a doctor");
                System.out.println("My name is " + name);
            }
        };
        sayHello("Kate", med, 31);

        Student noStudent = (name,age) -> {
            System.out.println("I am not a student. My name is " + name + "I am " + age);
            if(age>18){
                System.out.println("you can buy a beer");
            }
        };
        sayHello("Tom", noStudent, 22);
    }
    public static void sayHello(String name, Student student, int age) {
        student.sayHello(name,age);
    }
}
