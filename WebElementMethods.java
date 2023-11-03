package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {
 
	public static void main(String[] args) throws Throwable {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		/*
		//getCssValue
		driver.get("https://www.facebook.com");
		WebElement FBLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		String logo = FBLogo.getCssValue("font-size");
		System.out.print(logo);
		
		driver.get("https://www.facebook.com");
		WebElement FBLogo1 = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		String logo1 = FBLogo1.getCssValue("font-size");
		System.out.print(logo1);
		*/
		
		/*
		driver.get("https://www.amazon.in");
	    WebElement searchbar = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		searchbar.sendKeys("puma");
				//method3: clear()
		Thread.sleep(2000);
		searchbar.clear();
		Thread.sleep(2000);
        searchbar.sendKeys("nike");
         */
		
		/*
		//method4: submit()
		driver.get("https://www.amazon.in");
	    WebElement searchbar = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		searchbar.sendKeys("puma");
		searchbar.submit();    //submit() will only work for search bar
		*/
		
	 driver.get("https://www.amazon.in");
    /*   //method5: getLocation()
		WebElement data = driver.findElement(By.xpath("//a[text()='Facebook']"));
		Point text = data.getLocation();
		System.out.print(text);
		System.out.println(text.getX());
		System.out.println(text.getY());

		//method 6: getSize()
		Dimension size = data.getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		//method 7: getRect()
		Rectangle rect = data.getRect();
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		 */
		
		//method 8: isDisplayed()
		WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
		if (logo.isDisplayed())
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
				
	}
}
