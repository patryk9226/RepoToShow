import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

    public static void main(String[] args) {
        try {
            System.out.println("Before reading file");
            readFile("C:\\Users\\patry\\IdeaProjects\\RepoToShow\\src\\test2.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Wyjątek został wyrzucony");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Closing file");
        }
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}
