package com.uniqlo.Assignment2.Resources;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;





public class Base {

	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger=LogManager.getLogger(Base.class.getName());
	public static String currentdir=System.getProperty("user.dir");
	public WebDriver initializeDriver() throws Exception{
		
		logger.atLevel(Level.INFO);
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream(currentdir +"\\src\\main\\java\\com\\uniqlo\\Assignment2\\Resources\\config.properties");
		prop.load(fis);
		int WAIT_TIME=Integer.parseInt(prop.getProperty("WAIT_TIME"));
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", currentdir+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		}else {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\devi\\Downloads\\drivers\\geckodriver-v0.26.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();		
		}
		
		driver.manage().timeouts().pageLoadTimeout(WAIT_TIME, TimeUnit.SECONDS);
	driver.manage().timeouts()
		.implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();

		return driver;
	}
	}

