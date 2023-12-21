package class19;

import org.openqa.selenium.chrome.ChromeDriver;

public class E4Poly {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        chromeDriver.navigate().to("https://instagram.com");
        chromeDriver.navigate().back();
        Thread.sleep(2000);
        chromeDriver.close();



    }
}



