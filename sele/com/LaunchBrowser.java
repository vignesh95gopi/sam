package sele.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
		public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vignesh\\eclipse-workspace\\Sam\\driver\\chromedriver (1).exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement tab = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
		tab.click();
		
		WebElement conbox = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		conbox.click();
		
		Alert a = driver.switchTo().alert();
		String name = "vignesh";
		a.sendKeys(name);
		a.accept();
		
		WebElement text = driver.findElement(By.id("demo1"));
		String text2 = text.getText();
		if (text2.contains("vignesh")) {
			System.out.println(true);
			
		} else { System.out.println(false);

		}
		
	  	}
}
