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
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SelAuto {
public static void main(String[] args) throws InterruptedException, IOException, FindFailed {
	//register the chrome driver
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\Selenium jars\\chromedriver.exe");
	//create an obj to the driver -obj to the browser
	WebDriver wd=new ChromeDriver();//wd is the controller obj to web browser
	//maxmize the screen
	wd.manage().window().maximize();
	wd.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
	wd.get("https://www.amazon.in/");
	Screen sc=new Screen();
	Pattern p3=new Pattern("E:\\image6.png");
	sc.type(p3,"samsung");
	Pattern p4=new Pattern("E:\\image7.png");
	sc.click(p4);

}

}

//System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\Selenium jars\\chromedriver.exe");