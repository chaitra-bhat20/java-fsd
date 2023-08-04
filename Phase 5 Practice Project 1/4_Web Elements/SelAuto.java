import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelAuto {
public static void main(String[] args) throws InterruptedException {
	//register the chrome driver
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\Selenium jars\\chromedriver.exe");
	//create an obj to the driver -obj to the browser
	WebDriver wd=new ChromeDriver();//wd is the controller obj to web browser
	//maxmize the screen
	wd.manage().window().maximize();
	//web url 
	wd.get("http://127.0.0.1:5500/register.html");
	wd.findElement(By.name("id")).sendKeys("1");
	//close the browser
	Thread.sleep(20000);
	wd.close();
}
}




//System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\Selenium jars\\chromedriver.exe");