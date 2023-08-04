package selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\Selenium jars\\chromedriver.exe");
		//create an obj to the driver -obj to the browser
		WebDriver wd=new ChromeDriver();//wd is the controller obj to web browser
		//maxmize the screen
		wd.manage().window().maximize();
		//web url 
		wd.get("http://localhost:8083/WebSeleniumDemo/index.jsp");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the username");
		String name=sc.next();
		wd.findElement(By.name("user")).sendKeys(name);
		wd.findElement(By.name("submit")).submit();
		String actualres=wd.findElement(By.name("h1")).getText();
		String expres="data inserted successfully";
		
		//model -1 
		if(actualres.equals(expres)) {
			System.out.println("the testcase is passed");
		}
		else {
			System.out.println("the test case is failed");
		}
//		wd.close();
	}
}

