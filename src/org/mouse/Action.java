package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Dhanalakshmi\\Mouseover\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.flipkart.com");
	WebElement btn = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	btn.click();
	WebElement hmeapl = driver.findElement(By.xpath("(//li[@class='Wbt_B2 _1YVU3_'])[6]"));
Actions acc=new Actions(driver);
acc.moveToElement(hmeapl).perform();
}
}
