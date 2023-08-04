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
	wd.get("https://www.amazon.in/");
	wd.findElement(By.linkText("Start here.")).click();
	wd.findElement(By.id("ap_customer_name")).sendKeys("karthik");
	wd.findElement(By.id("ap_phone_number")).sendKeys("134567891");
	wd.findElement(By.id("ap_email")).sendKeys("ka@gmail.com");
	wd.findElement(By.id("ap_password")).sendKeys("123456789");//continue
	wd.findElement(By.id("continue")).click();
	//close the browser
	Thread.sleep(20000);
	wd.close();
}
}




//System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\Selenium jars\\chromedriver.exe");