package drivers;

public class WebDriverSecoundTest {
    public static void main(String[] args) {
        WebDriver chrom = new ChromeDriver();
        WebDriver secoundChrome = new ChromeDriver();

        WebDriver firefox = new FirefoxDriver();
        WebDriver secoundFirefox = new FirefoxDriver();
        WebDriver thirdFirefox = new FirefoxDriver();

        WebDriver safari = new WebDriver() {
            @Override
            public void get() {
                System.out.println("Opening page with Safari");
            }

            @Override
            public void findElementBy() {
                System.out.println("Finding element with Safari");
            }
        };

        safari.get();
        safari.findElementBy();
    }
}
