package seleniumproject2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        
        driver.findElement(By.className("proceed")).click();
        
     Alert a = driver.switchTo().alert();
     System.out.println(a.getText());
     Thread.sleep(1500);
        
	}

}
