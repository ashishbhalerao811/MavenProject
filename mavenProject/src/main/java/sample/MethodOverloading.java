package sample;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MethodOverloading {
	public static WebDriver driver=new ChromeDriver();
	
	public static void main(String[] args) {
		
		MethodOverloading m=new MethodOverloading();
		System.out.println(m.sum(5,6));
		System.out.println(m.sum(10, 20));
		/*************************************************************************/
		Actions act=new Actions(driver);
		act.contextClick();
		act.sendKeys(Keys.RIGHT);
		act.sendKeys(Keys.RETURN).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.CANCEL).sendKeys(Keys.BACK_SPACE).build().perform();
		act.doubleClick();
		/*************************************************************************/
		//Main page, frame(0), frame(1)
		driver.switchTo().frame(1);//switched to 2nd frame
		driver.switchTo().defaultContent();//switched main page
		driver.switchTo().frame(0);//switched to 1st frame
		driver.switchTo().defaultContent();//switched main page
		
		//for switching n no. of frames
		//int size = driver.findElements(By.tagName("iframe")).size();
		/*for(int i=0; i<=size; i++){ 
	    driver.switchTo().frame(i);
	    int total=driver.findElements(By.xpath("html/body/a/img")).size();
		System.out.println(total);
	    driver.switchTo().defaultContent(); //switching back from the iframe
	 }*/
		/*************************************************************************/
		
		
		WebDriverWait wait=new WebDriverWait(driver,20);
	}
	//Syntel interview que-
	//In method overloading, return type can be same or different.
	//Here, return types of both the methods are different i.e. float and int
	public float sum(float p, float q) {
		float r=p+q;
		return r;
		
		
	}
	public int sum(int a, int b) {
		int c=a+b;
		return c;
		
		
		
	}
}
