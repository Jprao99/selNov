package nov15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class Bascis2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		//driver.get("https://demoqa.com/");
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source,target).build().perform();
		
		String clr = target.getCssValue("background-color");
		Color cl= Color.fromString(clr);
		String hex = cl.asHex();
    System.out.println(hex);
		//Assert.assertEquals("#fffa90",hex);

	}

}
