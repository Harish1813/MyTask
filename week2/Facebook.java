package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[@rel='async']")).click();
driver.findElement(By.name("firstname")).sendKeys("Harsha");
driver.findElement(By.name("lastname")).sendKeys("B");
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("12345678910");
driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("Welcome@2023");

//DropDown
WebElement Day = driver.findElement(By.id("day"));
Select DropDay=new Select(Day);
DropDay.selectByValue("18");

//Drop2
WebElement Month = driver.findElement(By.id("month"));
Select DropMonth=new Select(Month);
DropMonth.selectByVisibleText("Feb");

//Drop3
WebElement Year = driver.findElement(By.id("year"));
Select DropYear=new Select(Year);
DropYear.selectByIndex(33);

driver.findElement(By.xpath("//label[text()='Female']")).click();



	}

}
