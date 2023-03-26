public class User {

    public String username;
    public String password;

    public User() {
    }

   public User(String username, String password) {
        System.out.println("Hellow z konstruktora");
        this.username = username;
        this.password = password;
    }

    public void sayHallo() {
        System.out.println("Hello my name is " + username);
    }
}
