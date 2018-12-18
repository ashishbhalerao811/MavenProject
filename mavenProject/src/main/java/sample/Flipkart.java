package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class=\"_2zrpKA\"]")).sendKeys("ashishbhalerao811@gmail.com");
		driver.findElement(By.xpath("//input[@class=\"_2zrpKA _3v41xv\"]")).sendKeys("abc123");
		driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
	

		
	}

}
