package com.franconnect.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestGuru99MultipleSession {
	WebDriver driver;
	@BeforeClass
	public void driver()
	{
	System.setProperty("webdriver.chrome.driver","C:\\workspace\\franconnect\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	}
	@Test    
    public void executSessionOne(){
            //First session of WebDriver
//        System.setProperty("webdriver.chrome.driver","C:\\workspace\\franconnect\\Drivers\\chromedriver.exe");
//            WebDriver driver = new ChromeDriver();
            //Goto guru99 site
            driver.get("http://demo.guru99.com/V4/");
            //find user name text box and fill it
            driver.findElement(By.name("uid")).sendKeys("Driver 1");
            
        }
        
    @Test    
        public void executeSessionTwo(){
            //Second session of WebDriver
//    	System.setProperty("webdriver.chrome.driver","C:\\workspace\\franconnect\\Drivers\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
        
        }
        
    @Test    
        public void executSessionThree(){
            //Third session of WebDriver
//    	System.setProperty("webdriver.chrome.driver","C:\\workspace\\franconnect\\Drivers\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 3");
        
        }        
    @AfterClass
    public void closeBrowser()
    {
    //	driver.close();
    }
}
