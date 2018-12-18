package sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripTableTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights?gclid=EAIaIQobChMIu6eMzNmm3wIVkQ4rCh2UtwC2EAAYASAAEgIaifD_BwE&cmp=SEM%7CD%7CDF%7CG%7CBrand%7CB_M_Makemytrip_Search_Exact%7CBrand_Top_5_Exact%7CExpanded%7C262047047498&s_kwcid=AL!1631!3!262047047498!e!!g!!makemytrip&ef_id=EAIaIQobChMIu6eMzNmm3wIVkQ4rCh2UtwC2EAAYASAAEgIaifD_BwE%3AG%3As");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(".//*[@id='hp-widget__depart']")).click();
//		Thread.sleep(5000);
//		List<WebElement>list=driver.findElements(By.xpath(".//*[@class='ui-datepicker-group ui-datepicker-group-first']"));
//		int count=list.size();	
//		System.out.println(count);
		String color=driver.findElement(By.xpath(".//*[@id='searchBtn']")).getCssValue("background-color");
		System.out.println(color);
		
		String btncolor=driver.findElement(By.xpath(".//*[@id='searchBtn']")).getCssValue("color");// background, font, border, border-top, margin, margin-top, padding, padding-top, list-style, outline, pause, cue)
		System.out.println(btncolor);

		String font=driver.findElement(By.xpath(".//*[@id='searchBtn']")).getCssValue("font-size");
		System.out.println(font);
		driver.quit();
	}

}
