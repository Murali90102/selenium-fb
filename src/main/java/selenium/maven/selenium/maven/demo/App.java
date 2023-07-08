package selenium.maven.selenium.maven.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
      
       WebDriver driver = new ChromeDriver();
       
      driver.get("https://www.facebook.com/");
      
      driver.findElement(By.id("email")).sendKeys("murali.appari@outlook.com");
      
      driver.findElement(By.id("pass")).sendKeys("Mur@li90102");
      
      driver.findElement(By.name("login")).click();
      
      
    }
}
