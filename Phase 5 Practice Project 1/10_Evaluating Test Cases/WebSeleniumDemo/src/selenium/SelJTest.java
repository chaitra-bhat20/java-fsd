package selenium;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelJTest {
	WebDriver wd=null;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\Selenium jars\\chromedriver.exe");
		//create an obj to the driver -obj to the browser
		wd=new ChromeDriver();//wd is the controller obj to web browser
		//maxmize the screen
		wd.manage().window().maximize();
		//web url 
		wd.get("http://localhost:8083/webselenium/index.jsp");
	}
	
	
	@Test
	public void test1() {
		wd.findElement(By.name("user")).sendKeys("Chaitra");
		wd.findElement(By.name("submit")).submit();
		String actualres=wd.findElement(By.name("h1")).getText();
		String expres="data inserted successfully";
		assertEquals(expres, actualres);
		wd.close();
	}
	
	
	@Test
	public void test2() {
		wd.findElement(By.name("user")).sendKeys("Bhat");
		wd.findElement(By.name("submit")).submit();
		String actualres=wd.findElement(By.name("h1")).getText();
		String expres="data inserted successfully";
		assertEquals(expres, actualres);
		wd.close();
	}
	@After
	public void deref() {
		wd=null;
	}
	
	
}
