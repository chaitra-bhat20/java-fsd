import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelAuto {
public static void main(String[] args) throws InterruptedException, IOException {
	//register the chrome driver
	System.setProperty("webdriver.chrome.driver","F:\\seleniumjars\\chromedriver.exe");
	//create an obj to the driver -obj to the browser
	WebDriver wd=new ChromeDriver();//wd is the controller obj to web browser
	//maxmize the screen
	wd.manage().window().maximize();
	//web url 
	wd.get("https://www.amazon.in/");
	JavascriptExecutor js=(JavascriptExecutor)wd;
	
//no of pixels
//js.executeScript("window.scrollBy(0,1000)");
	
	
   
	WebElement we=wd.findElement(By.linkText("Help"));
	js.executeScript("arguments[0].scrollIntoView();",we);
	if(we!=null) {
		takeScreenshot(wd,"amazon");
	}
	we.click();
	
//scroll down to the last
//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
}

public static void takeScreenshot(WebDriver wd,String fileName) throws IOException {
	//take the screenshot and store it as a file format
	File file=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	//now copy the screen shot to the specified location 
	FileUtils.copyFile(file,new File("F:\\"+fileName+".png"));
}

}
