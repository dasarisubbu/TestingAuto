package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {
	
	
	public WebDriver driver;
	public void openurl()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Testing_Automation\\chromedriver.exe\\");
		driver =new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
	}
	public void register()
	{
		driver.findElement(By.id("firstName")).sendKeys("subbu");
		driver.findElement(By.id("lastName")).sendKeys("chinni");
		driver.findElement(By.id("userEmail")).sendKeys("dsubbupp@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9367647778");
		driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
		driver.findElement(By.id("uploadPicture")).click();
		driver.findElement(By.id("currentAddress")).click();
		driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]")).click();
		
		
		
		
	
	
	}
	
	public static void main(String[] args) {
		Demoqa d=new Demoqa();
		d.openurl();
		d.register();
	

	}

}
