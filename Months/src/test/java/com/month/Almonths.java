package com.month;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class Almonths 
{
	@Test
	public void getMonthsDetails()
	{
		String key="webdriver.chrome.driver";
		String value="E:\\BrowserDrivers\\common\\chromedriver.exe";
		System.setProperty(key, value);
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("E:\\Demohtml\\months.html");
		WebElement list=driver.findElement(By.id("month"));
		Select select=new Select(list);
   List<WebElement> alist = select.getOptions();
   int count=alist.size();
   for(int i=0;i<count;i++)
   {
	   WebElement elem=alist.get(i);
	   String text=elem.getText();
	   System.out.println(text);
   }
		
			
	
	
	}

	public static void main(String[] args) 
	{
		TestListenerAdapter t= new TestListenerAdapter();
		TestNG test=new TestNG();
		test.setTestClasses(new Class[]
				{
					Almonths.class
				});
		test.addListener(t);
		test.run();
		
	}

}
