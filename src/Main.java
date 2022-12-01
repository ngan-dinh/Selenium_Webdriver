import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //lay duong dan den thu muc goc, mac dinh user.dir
//    String projectPath = System.getProperty("user.dir");
//    //tro duong dan den chrome driver
//    System.setProperty("webdriver.chrome.driver", projectPath + "/web_drivers/chromedriver.exe");
//    //khoi tao chrome driver
//    WebDriver driver= new ChromeDriver();
//    //dieu huong den web google.com
//    driver.get("https://google.com");
//    //
//    Thread.sleep (5000);
//    //
//    driver.quit();
//        String projectPath = System.getProperty("user.dir");
//        System.setProperty("webdriver.gecko.driver", projectPath + "/web_drivers/geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        driver.get("https://google.com");
//        Thread.sleep(5000);
//        driver.quit();
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.opera.driver", projectPath + "/web_drivers/operadriver.exe");
        WebDriver driver = new OperaDriver();
        driver.get("https://google.com");
        // mở full màn hình
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.quit();

    }
}