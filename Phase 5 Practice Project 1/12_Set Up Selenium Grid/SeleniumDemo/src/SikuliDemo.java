import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Screen;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;


public class SikuliDemo {
	public static void main(String[] args) throws InterruptedException, IOException, FindFailed {
		//register the Chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\Selenium jars\\chromedriver.exe");

		WebDriver wd=new ChromeDriver();
	
		wd.manage().window().maximize();
		
		wd.get("http://127.0.0.1:5500/register.html");
		wd.findElement(By.name("id")).sendKeys("1");
		Thread.sleep(3000);
		wd.findElement(By.name("name")).sendKeys("chaitra");
		Thread.sleep(3000);
		wd.findElement(By.name("email")).sendKeys("c@c.com");
		Thread.sleep(3000);
		wd.findElement(By.name("pass")).sendKeys("abcd");
		Thread.sleep(3000);
		wd.findElement(By.id("female")).click();
		Thread.sleep(3000);
		wd.findElement(By.name("date")).sendKeys("12-05-2023");
		Thread.sleep(3000);
		wd.findElement(By.id("fs1")).click();
		Thread.sleep(3000);
		wd.findElement(By.id("fs2")).click();
		Thread.sleep(3000);
		Select sc=new Select(wd.findElement(By.name("sub")));
		sc.selectByVisibleText("Java");
		Thread.sleep(3000);
		wd.findElement(By.name("address")).sendKeys("Bangalore, Karnataka");
		Thread.sleep(3000);
		
		Screen sc1=new Screen();
		Pattern p=new Pattern("E:\\upload.jpg");
		sc1.click(p);
		Runtime.getRuntime().exec("E:\\fileupload.exe");
		Thread.sleep(10000);
		wd.findElement(By.name("register")).click();
		
		
		//this is comletely using sikuli
//		Pattern p1=new Pattern("F:\\search.png");
//		s.type(p1,"F:\\sai\\Passport.pdf");
//		Pattern p2=new Pattern("F:\\open.png");
//		s.click(p2);
//		wd.findElement(By.name("register")).click();
		
//		this is completely using Autoitok
//		wd.findElement(By.name("file")).click();
//		Runtime.getRuntime().exec("F:\\Autoit\\filleupload.exe");
		
	}
}




