package drivers;

import drivers.WebDriver;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkęza pomocą Chroma");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję element za pomocę przeglądarki Chrome");
    }
}
