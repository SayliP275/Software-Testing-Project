package Selnm_Practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;


public class ToolsQA_PW {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		// Open Browser
		System.setProperty("webdriver.gecko.driver", "E:\\sayli\\Software Testing\\Testing\\Selenium JAR\\geckodriver.exe");
		WebDriver w= new FirefoxDriver();
		
		w.get("https://demoqa.com/");
		
		w.manage().window().maximize();
		
		Thread.sleep(2000);
		
		w.getTitle();
		System.out.println("Title of page is : "+w.getTitle());
		
		w.getCurrentUrl();
		System.out.println("Current URL is : "+w.getCurrentUrl());

		// Widgets Module
		// for scroll down the page & click on widgets 
		JavascriptExecutor js= (JavascriptExecutor) w; 
		
		js.executeScript("window.scrollBy(0, 300)");
		
		w.findElement(By.xpath("//h5[contains(text(),'Widgets')]")).click();
		w.manage().window().maximize();
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(2000);
		
		w.getTitle();
		System.out.println("Title of Current page is : "+w.getTitle());
		
		w.getCurrentUrl();
		System.out.println("Current URL is : " +w.getCurrentUrl());
				
// for Accordian
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(2000);

		w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[1]/span[1]")).click();
		Thread.sleep(2000);

		w.findElement(By.xpath("//div[@id='section1Heading']")).click();
		Thread.sleep(2000);
		
		w.findElement(By.id("section2Heading")).click();
		Thread.sleep(2000);
		                                                                                                                                                                    
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		
		w.findElement(By.xpath("//*[@id=\"section3Heading\"]")).click();
		Thread.sleep(2000);
		
		List<WebElement> L= w.findElements(By.tagName("a"));
		System.out.println("Total Links are : "+L.size());
		w.navigate().back();
		Thread.sleep(2000);
		
// for Auto Complete
		js.executeScript("window.scrollBy(0,500)");
		w.findElement(By.xpath("//span[contains(text(),'Auto Complete')]")).click();
		Thread.sleep(2000);
				
		w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
	/*	w.findElement(By.xpath("//div[contains(text(),'Red')]")).click();
		w.findElement(By.xpath("//div[contains(text(),'Purple')]")).click();
		w.findElement(By.xpath("//div[contains(text(),'Indigo')]")).click();
		Thread.sleep(2000);        */
		w.findElement(By.xpath("//*[@id=\"autoCompleteSingleContainer\"]/div/div[1]")).click();   //sendKeys("Orange");
	//	w.findElement(By.xpath("//*[@id=\"autoCompleteSingleContainer\"]/div/div[1]/div[1]")).click();        	//Defect - not accepting data    */
	
		w.navigate().back();  
		Thread.sleep(2000); 
 
// for Date Picker
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(2000);
		w.findElement(By.xpath("//span[contains(text(),'Date Picker')]")).click();
		Thread.sleep(2000);
		
	// for Select Date
		w.findElement(By.id("datePickerMonthYearInput")).click();
		Select s1= new Select(w.findElement(By.className("react-datepicker__month-select")));
		s1.selectByValue("4");
		Thread.sleep(2000);
		
		Select s2= new Select(w.findElement(By.className("react-datepicker__year-select")));
		s2.selectByVisibleText("1993");
		Thread.sleep(2000);
		
		w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[5]/div[5]")).click();
		Thread.sleep(2000);
		System.out.println("05/27/1993 Date is selected");
// for Date And Time
		w.findElement(By.id("dateAndTimePickerInput")).click();
		js.executeScript("window.scrollBy(0,350)");

		w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]")).click();
		Thread.sleep(2000);

		w.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/span[1]")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[13]/a[1]")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		w.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[6]")).click();
		w.findElement(By.xpath("//div[contains(text(),'10')]")).click();
		Thread.sleep(2000);
//for time	
		w.findElement(By.id("dateAndTimePickerInput")).click();
		js.executeScript("window.scrollBy(0,350)");
		Thread.sleep(2000);
		w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]")).click();
/*		js.executeScript("window.scrollBy(0,-200)");
		w.findElement(By.xpath("//li[contains(text(),'17:30')]")).click();
		Thread.sleep(2000);       */
		System.out.println("June/10/2022 5:30 PM Date & time is selected");
		w.navigate().back();
		Thread.sleep(2000);
			
// for Slider
		js.executeScript("window.scrollBy(0,350)");
		Thread.sleep(2000);
		w.findElement(By.xpath("//span[contains(text(),'Slider')]")).click();
		System.out.println("Slider WebPage is open");
		Thread.sleep(2000);
		
		WebElement slider=w.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
		Actions act= new Actions(w);
		act.dragAndDropBy(slider,-150, 100).perform();     //move to backward
		Thread.sleep(2000);
		act.dragAndDropBy(slider, 200, 100).perform();     // move to forward
		Thread.sleep(2000);
		
		TakesScreenshot t = (TakesScreenshot) w;
		File src= t.getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File ("D:\\Backup\\Desktop\\Selenm\\Screenshot\\slider2.jpeg"));
		w.navigate().back();
		Thread.sleep(2000);
	
// for Progress Bar
		js.executeScript("window.scrollBy(0,500)");
		w.findElement(By.xpath("//span[contains(text(),'Progress Bar')]")).click();
		System.out.println("Progress Bar WebPage is open");
		Thread.sleep(2000);
		
		w.findElement(By.xpath("//*[@id=\"startStopButton\"]")).click();
		Thread.sleep(4000);
		w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]")).click();
		Thread.sleep(2000);
		w.navigate().back();
		Thread.sleep(2000);
		
// for Tabs
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		w.findElement(By.xpath("//span[contains(text(),'Tabs')]")).click();
		System.out.println("Tabs WebPage is open");
		Thread.sleep(2000);
		
		w.findElement(By.id("demo-tab-origin")).click();
		Thread.sleep(2000);
		w.findElement(By.id("demo-tab-what")).click();
		Thread.sleep(2000);
		w.findElement(By.linkText("Use")).click();
		Thread.sleep(2000);
//		w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/nav[1]/a[4]")).click();
		boolean eleEnabled=	w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/nav[1]/a[4]")).isEnabled();
		System.out.println(eleEnabled);
		Thread.sleep(2000);

		w.navigate().back();
		Thread.sleep(2000);
		
// for 	Tool Tips
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		w.findElement(By.xpath("//span[contains(text(),'Tool Tips')]")).click();
		System.out.println("Tool Tips WebPage is open");
		Thread.sleep(2000);
		
		Actions A1 = new Actions(w);
		A1.moveToElement(w.findElement(By.xpath("//button[@id='toolTipButton']"))).perform();
		Thread.sleep(2000);
		
		WebElement text=w.findElement(By.xpath("//input[@id='toolTipTextField']"));
		Actions A2 = new Actions(w);
		A2.moveToElement(text).click().keyDown(Keys.SHIFT).sendKeys("Hello").build().perform();
		
		Actions A3 = new Actions(w);
		A3.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Contrary')]"))).perform();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,300)");
		Actions A4 = new Actions(w);
		A4.moveToElement(w.findElement(By.xpath("//a[contains(text(),'1.10.32')]"))).perform();
		Thread.sleep(2000);
		w.navigate().back();
		Thread.sleep(2000);
	
	// for Menu
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[8]/span[1]")).click();
		System.out.println("Menu WebPage is open");
		Thread.sleep(2000);
		
		w.findElement(By.linkText("Main Item 1")).click();
		Thread.sleep(2000);
		
		Actions A5 = new Actions(w);
		A5.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Main Item 2')]"))).perform();
		w.findElement(By.linkText("Sub Item")).click();
		Thread.sleep(3000);
		
		Actions A6 = new Actions(w);
		A6.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Main Item 2')]"))).perform();

		A6.moveToElement(w.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST »')]"))).perform();
		w.findElement(By.xpath("//a[contains(text(),'Sub Sub Item 2')]")).click();
		Thread.sleep(2000);
		
		w.findElement(By.xpath("//a[contains(text(),'Main Item 3')]")).click();
		w.navigate().back();
		w.navigate().back();
		Thread.sleep(2000);
	
// for Select Menu		
		js.executeScript("window.scrollBy(0,650)");
		Thread.sleep(2000);
		w.findElement(By.xpath("//span[contains(text(),'Select Menu')]")).click();
		System.out.println("Select Menu WebPage is open");
		Thread.sleep(2000);
		
//select Value
		w.findElement(By.xpath("//*[@id=\"withOptGroup\"]/div/div[1]/div[1]")).click();
		w.findElement(By.xpath("//div[contains(text(),'Group 2, option 1')]")).click();
		Thread.sleep(2000);
//Select one
		w.findElement(By.xpath("//*[@id=\"selectOne\"]/div/div[1]")).click();
		w.findElement(By.xpath("//div[contains(text(),'Ms.')]")).click();
		Thread.sleep(2000);
// Old Style Select Menu
		Select s3= new Select(w.findElement(By.xpath("//select[@id='oldSelectMenu']")));
		s3.selectByValue("4");
		Thread.sleep(2000);
// multiselect Drop down
		
		js.executeScript("window.scrollBy(0, 400)", "");
		w.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]")).click();
		w.findElement(By.xpath("//div[contains(text(),'Blue')]")).click();
		Thread.sleep(2000);
		
		w.findElement(By.xpath("//div[contains(text(),'Black')]")).click();
		Thread.sleep(2000);

		w.findElement(By.xpath("//div[contains(text(),'Green')]")).click();
		Thread.sleep(2000);
		
		w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/*[1]")).click();
		Thread.sleep(2000);
		
// Standard multi select
		Select s4= new Select(w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[8]/div[1]/select[1]")));
		s4.selectByVisibleText("Volvo");
		s4.selectByValue("audi");
		Thread.sleep(2000);
	
		System.out.println(w.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div")).getText());
		w.navigate().back();
		w.navigate().back();
		w.close();		
	}

}
