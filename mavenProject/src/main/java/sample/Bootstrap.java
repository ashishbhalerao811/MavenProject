package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		driver.findElement(By.xpath("//*[@id=\"menu1\"]")).click();
		List<WebElement>list=driver.findElements(By.xpath("//ul[@class='dropdown-menu test' and @role='menu']//li/a"));
		for(int i=0;i<=list.size();i++ ) {
			if(list.get(i).getText().equals("java"))
			{
				list.get(i).click();
				break;
			}
		}
	}

}
