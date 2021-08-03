package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	
	public WebDriver driver;
	
	public void openurl()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Testing_Automation\\chromedriver.exe\\");
		driver =new ChromeDriver();
		driver.get("http://gmail.com");
 
	}
	public void login()
	{
		driver.findElement(By.id("identifierId")).sendKeys("dsubbupp@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
		driver.findElement(By.name("password")).sendKeys("1234567896");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]")).click();
	}
	public void compose()
	{
		driver.findElement(By.xpath("//*[@id=\":kr\"]/div/div")).click();
		driver.findElement(By.id(":qp")).sendKeys("ds@123");
		driver.findElement(By.id("q7")).sendKeys("hi");
		driver.findElement(By.xpath("//*[@id=\":rn\"]")).sendKeys();
		driver.findElement(By.id(":px")).click();
		
	}
	public void logout()
	{
		driver.findElement(By.id("gb_71")).click();
	}
	

	public static void main(String[] args) {
		Gmail g=new Gmail();
		  g.openurl();
		  g.login();
		  g.compose();
		  g.logout();
	

	}

}
