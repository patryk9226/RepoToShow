package drivers;

import drivers.WebDriver;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkęza pomocą Firefoxa");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję element za pomocę przeglądarki Firefox");
    }
}
