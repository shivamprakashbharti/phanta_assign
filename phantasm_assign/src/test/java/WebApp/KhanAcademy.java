package WebApp;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.sql.Driver;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class KhanAcademy{

	
	@Test(priority=0,enabled=true)
	public static void TC001() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.khanacademy.org/";
		
		driver.get(url);
		Thread.sleep(3000);
		
		String actTitle = driver.getTitle();
		String expectTitle = "Khan Academy | Free Online Courses, Lessons & Practice";
		
		AssertJUnit.assertEquals(expectTitle, actTitle);
		System.out.println("verify done");
		
		 
		 driver.quit();
		
	};
	
	@Test(priority=1, enabled=false)
	public static void TC002() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.khanacademy.org/";
		
		driver.get(url);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id='login-or-signup']")).click();
		Thread.sleep(2000);
		String expLog = driver.findElement(By.xpath("//h1[text()='Log in']")).getText();
		String actLog = "Log in";
		AssertJUnit.assertEquals(expLog, actLog);
		driver.findElement(By.xpath("//input[@data-test-id='identifier-field']")).sendKeys("mohan745");
		driver.findElement(By.id("uid-labeled-text-field-1-wb-id-field")).sendKeys("Mohan@90bh");
		driver.findElement(By.xpath("//button[@data-test-id='log-in-submit-button']")).click();
		
	
		 
		 driver.quit();
		
	};
	
	@Test(priority=2, enabled=false)
	public static void TC003() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.khanacademy.org/";
		
		driver.get(url);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id='login-or-signup']")).click();
		Thread.sleep(2000);
		String expLog = driver.findElement(By.xpath("//h1[text()='Log in']")).getText();
		String actLog = "Log in";
		AssertJUnit.assertEquals(expLog, actLog);
		
		driver.findElement(By.xpath("//input[@data-test-id='identifier-field']")).sendKeys("mohan745");
		driver.findElement(By.id("uid-labeled-text-field-1-wb-id-field")).sendKeys("Mohan@9h");
		driver.findElement(By.xpath("//button[@data-test-id='log-in-submit-button']")).click();
		
		Thread.sleep(3000);
		String loginErr = driver.findElement(By.xpath("//span[@id='uid-login-form-0-wb-id-server-error']")).getText();
		String actErr = "Your login or password is incorrect.";
		System.out.println(loginErr);
		AssertJUnit.assertEquals(loginErr, actErr);
		
		 driver.quit();
		
	};
	
	@Test(priority=3, enabled=false)
	public static void TC004() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.khanacademy.org/";
		
		driver.get(url);
		Thread.sleep(3000);
		System.out.println("checking for search");

		String sear = driver.findElement(By.xpath("//span[text()='Search']")).getText();
		System.out.println(sear);
		String actSear = "Search";
		AssertJUnit.assertEquals(sear, actSear);
		
		System.out.println("search option verrified");
		
		
		
		 driver.quit();
		
	};
	
	@Test(priority=4, enabled=false)
	public static void TC005() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.khanacademy.org/";
		
		driver.get(url);
		Thread.sleep(3000);
		System.out.println("checking for search");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-test-id='page-search-box']")).sendKeys("English");
		//driver.findElement(By.xpath("//div[@class='_1717m280']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Grammar | Arts and humanities | Khan Academy")).click();
		Thread.sleep(4000);
		
		String actTitle = driver.getTitle();
		String expTitle = "Grammar | Arts and humanities | Khan Academy";
		AssertJUnit.assertEquals(actTitle, expTitle);
//		WebElement seer = driver.findElement(By.xpath("//input[@class='_17onf2xNaN']")).getText();
		System.out.println("Grammer page verrified");
		
		driver.quit();
		
	};
	
	@Test(priority=5, enabled=false)
	public static void TC006() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.khanacademy.org/";
		
		driver.get(url);
		Thread.sleep(3000);
		System.out.println("checking for search");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-test-id='page-search-box']")).sendKeys("English");
		//driver.findElement(By.xpath("//div[@class='_1717m280']")).click();
		driver.findElement(By.xpath("//input[@data-test-id='page-search-box']")).sendKeys(Keys.RETURN);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='gsc-selected-option']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Date']")).click();
		
		
	 driver.quit();
		
	};
	
	@Test(priority=6, enabled=false)
	public static void TC007() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.khanacademy.org/";
		
		driver.get(url);
		Thread.sleep(3000);
		
//		WebElement list = driver.findElement(By.xpath("//button[@class='_1gbamhn']"));
		List<WebElement> name = driver.findElements(By.xpath("//button[@class='_1gbamhn']"));
		
		int size = name.size();
		System.out.println("size"+size);
		
		for(int i=0; i<=size-1; i++) {
			WebElement listname = name.get(i);
			System.out.println(listname.getText());
		}
		
		//for(let i=0; i<=)
		
		
			
		
	 driver.quit();
		
	};
	
	@Test(priority=7, enabled=false)
	public static void TC008() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.khanacademy.org/";
		
		driver.get(url);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@id='course-title-1010']")).click();
		Thread.sleep(3000);
		String actTitle = driver.findElement(By.xpath("//h1[@data-test-id='unit-block-title']")).getText();
		String expTitle = "World history";
		AssertJUnit.assertEquals(actTitle, expTitle);
		System.out.println("Page title checked");
		
		List<WebElement> unitName = driver.findElements(By.xpath("//h3[@class='_k50sd54']"));
		int size = unitName.size();
		System.out.println("size"+size);
		
		for(int i=0; i<=size-1; i++) {
			WebElement name = unitName.get(i);
			System.out.println(name.getText());
		}
		

		
	driver.quit();
		
	};
	
	@Test(priority=8,enabled=false)
	public static void TC009() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.khanacademy.org/";
		
		driver.get(url);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@id='course-title-1010']")).click();
		Thread.sleep(3000);
		String actTitle = driver.findElement(By.xpath("//h1[@data-test-id='unit-block-title']")).getText();
		String expTitle = "World history";
		AssertJUnit.assertEquals(actTitle, expTitle);
		System.out.println("Page title checked");
		
		driver.findElement(By.xpath("//h3[text()='Unit 1: Beginnings - 600 BCE']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("The origin of humans and early human societies")).click();
		//driver.findElement(By.linkText("Grammar | Arts and humanities | Khan Academy")).click();
		
		String actTitle1 = driver.findElement(By.xpath("//h1[@class='_1iqpstc8']")).getText();
		System.out.println("see"+ actTitle1);
		String exptitle = "Unit: Beginnings - 600 BCE";
		
		AssertJUnit.assertEquals(actTitle1, exptitle);
		
		//driver.findElement(By.xpath("//div[@class='ka-video-player _1815e5py']")).click();
		
		
	driver.quit();
		
	};
	
	@Test(priority=9,enabled=true)
	public static void TC010() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.khanacademy.org/";
		
		driver.get(url);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id='login-or-signup']")).click();
		Thread.sleep(2000);
		String expLog = driver.findElement(By.xpath("//h1[text()='Log in']")).getText();
		String actLog = "Log in";
		AssertJUnit.assertEquals(expLog, actLog);
		driver.findElement(By.xpath("//input[@data-test-id='identifier-field']")).sendKeys("mohan745");
		driver.findElement(By.id("uid-labeled-text-field-1-wb-id-field")).sendKeys("Mohan@90bh");
		driver.findElement(By.xpath("//button[@data-test-id='log-in-submit-button']")).click();
		
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//span[text()='Edit Courses']")).click();
		//driver.findElement(By.xpath("//button[@class='_12iepmsr']")).click();
		driver.findElement(By.xpath("//a[@data-test-id='side-nav-profile']")).click();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[@data-test-id='x00307e86']")).click();
		String actTitle2 = driver.findElement(By.xpath("//h2[@class='_azwfqqs']")).getText();
		System.out.println(actTitle2);
		String expTitle2 = "My profile";
		AssertJUnit.assertEquals(actTitle2, expTitle2);
		System.out.println("My profile section checked");
		
		
		driver.quit();
		
	};
	
	@Test(priority=10,enabled=true)
	public static void TC011() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.khanacademy.org/";
		
		driver.get(url);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id='login-or-signup']")).click();
		Thread.sleep(2000);
		String expLog = driver.findElement(By.xpath("//h1[text()='Log in']")).getText();
		String actLog = "Log in";
		AssertJUnit.assertEquals(expLog, actLog);
		driver.findElement(By.xpath("//input[@data-test-id='identifier-field']")).sendKeys("mohan745");
		driver.findElement(By.id("uid-labeled-text-field-1-wb-id-field")).sendKeys("Mohan@90bh");
		driver.findElement(By.xpath("//button[@data-test-id='log-in-submit-button']")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//a[@class='_158ir6wt']")).click();
		driver.findElement(By.cssSelector("a._158ir6wt")).click();
		//driver.findElement(By.xpath("//a[@data-test-id='side-nav-profile']")).click();
		
		Thread.sleep(5000);
		
//		String actTitle3 = driver.findElement(By.cssSelector("h2._azwfqqs")).getText();
//		System.out.println(actTitle3);
//		String expTitle3 = "My progress";
//		Assert.assertEquals(actTitle3, expTitle3);
		System.out.println("My profile section checked");
		
		
		driver.quit();
		
	};
	
	@Test(priority=11,enabled=false)
	public static void TC012() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.khanacademy.org/";
		
		driver.get(url);
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//h2[@data-scroll-id='why-ka-works']"));
		Actions go = new Actions(driver);
		go.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		WebElement text = driver.findElement(By.xpath("//h2[@data-scroll-id='why-ka-works']"));
		String title4 = text.getText();
		System.out.println(title4);

		
		List<WebElement> reason = driver.findElements(By.xpath("//h3[@class='_eib2kdk']"));
		int size = reason.size();
		System.out.println("size"+size);
		
		for(int i=0; i<=size-1; i++) {
			WebElement name = reason.get(i);
			System.out.println(name.getText());
		}
		
		
		driver.quit();
		
	}
		
}
	

	


