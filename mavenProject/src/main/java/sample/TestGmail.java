package sample;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGmail {

	public static void main(String[] args) throws Exception {
//		Properties prop=new Properties();
		System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Create an account')]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//prop.getProperty("uName")
		Set<String> handles=driver.getWindowHandles();
		int handleSize=handles.size();
		System.out.println(handleSize);
		
		Thread.sleep(3000);
//		Iterator<String>it=handles.iterator();
//		
////		while(it.hasNext()) {}
//			
//		
//		String parentW=it.next();
//		System.out.println(parentW);
//		
//		Thread.sleep(3000);
//		String childW1=it.next();
		
//		Thread.sleep(3000);
//		String childW2=it.next();
//		driver.switchTo().window(childW1);
//		driver.close();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys("Tom");

		driver.findElement(By.xpath(".//*[@id='lastName']")).sendKeys("White");
		
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("tom1123");
		
		driver.findElement(By.xpath(".//*[@id='accountDetailsNext']/div[2]")).click();
		
	}

}
