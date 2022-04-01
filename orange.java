package com.testNG;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class orange {
public static WebDriver driver;
			
			@Test
			public void education() throws Exception {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\OrangeHRM\\Driver\\Driver\\chromedriver.exe");
				 WebDriver driver = new ChromeDriver();
				 driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
				 Thread.sleep(1000);
					driver.findElement(By.name("txtUsername")).sendKeys("Admin");
					driver.findElement(By.name("txtPassword")).sendKeys("admin123");
					driver.findElement(By.name("Submit")).click();
					driver.findElement(By.id("menu_admin_Qualifications")).click();
			driver.findElement(By.id("menu_admin_viewEducation")).click();
			driver.findElement(By.id("btnAdd")).click();
			driver.findElement(By.name("education[name]")).sendKeys("Phd");
			driver.findElement(By.name("btnSave")).click();
			JavascriptExecutor je = (JavascriptExecutor) driver;
		    WebElement e= driver.findElement(By.id("footer"));
			je.executeScript("arguments[0].scrollIntoView();", e);
		   je.executeScript("window.scrollBy(15000,0 )");
		}
@Test
public void  negative() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\OrangeHRM\\Driver\\Driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
	 Thread.sleep(1000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.id("menu_admin_Qualifications")).click();
	driver.findElement(By.id("menu_admin_Qualifications")).click();
	driver.findElement(By.id("menu_admin_viewEducation")).click();
	driver.findElement(By.id("btnAdd")).click();
	driver.findElement(By.name("education[name]")).sendKeys("111");
	driver.findElement(By.name("btnSave")).click();
	JavascriptExecutor je = (JavascriptExecutor) driver;
   
}


@Test
public void SkillEdit() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\OrangeHRM\\Driver\\Driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
	 Thread.sleep(1000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.id("menu_admin_Qualifications")).click();
		 driver.findElement(By.id("menu_admin_viewSkills")).click();
		 driver.findElement(By.id("btnAdd")).click();
		 driver.findElement(By.name("skill[name]")).sendKeys(".net");
		 driver.findElement(By.name("skill[description]")).sendKeys("Framework");
		 driver.findElement(By.id("btnSave")).click();
		 JavascriptExecutor je = (JavascriptExecutor) driver;
		 je.executeScript("window.scrollBy(15000,0 )");
}








/*@Test(priority=-1)
//	public void test() throws Exception {
		
	//	 driver.findElement(By.id("menu_admin_Qualifications")).click();
			 driver.findElement(By.id("menu_admin_viewSkills")).click();
			 driver.findElement(By.id("btnAdd")).click();
			 driver.findElement(By.name("skill[name]")).sendKeys(".net");
			 driver.findElement(By.name("skill[description]")).sendKeys("Framework");
			 driver.findElement(By.id("btnSave")).click();
			 }*/
	
/*	@Test
	public void Education() {
		driver.findElement(By.id("menu_admin_viewEducation")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.name("education[name]")).sendKeys("Phd");
		driver.findElement(By.name("btnSave")).click();
	}*/
}
	
	/*@BeforeTest 
	
	public void browser() throws Exception {
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
	}
	
	@BeforeClass
	public void login() throws InterruptedException { 
		Thread.sleep(1000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver
	}
	
	@BeforeMethod
	public void method() throws InterruptedException, Exception {
		 driver.findElement(By.id("menu_admin_Qualifications")).click();
		 Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	
	@Test
	public void test() {
		 driver.findElement(By.id("menu_admin_Qualifications")).click();
			 driver.findElement(By.id("menu_admin_viewSkills")).click();
			 driver.findElement(By.id("btnAdd")).click();
			 driver.findElement(By.name("skill[name]")).sendKeys(".net");
			 driver.findElement(By.name("skill[description]")).sendKeys("Framework");
			 driver.findElement(By.id("btnSave")).click();
	
	}
	@AfterMethod
	public void afterMethod() {
		
	}
	
	@AfterClass
	public void afterClass() {
		
	}
	@AfterTest
	public void afterTest() {
		
	}*/
	

