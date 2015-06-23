package madi;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class madich
{
   WebDriver driver = new FirefoxDriver();
   public void launchapp()
   { //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      // Launch website
      driver.navigate().to("http://www.shophive.com/apple/mac?p=");
      driver.manage().window().maximize();

      
      // Get the Result Text based on its xpath
      String result = driver.findElement(By.xpath("//div[1]/ol/li/a")).getText();
      System.out.println(" The Result is " + result);
 
      driver.close();
   }
}
  