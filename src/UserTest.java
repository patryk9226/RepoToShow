public class UserTest {

    public static void main(String[] args) {

        //User user = new User();
        User user = new User("Patryk", "Helloł");

        //user.username = "Patryk";
        //user.password = "Asdasda";
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHallo();
    }
}
