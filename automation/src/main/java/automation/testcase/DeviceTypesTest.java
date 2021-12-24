package automation.testcase;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
// Generated by Selenium IDE
//import org.junit.Test;
//import org.junit.Before;
//import org.junit.After;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automation.utility.BaseClass;
import  automation.utility.Commons;

public class DeviceTypesTest extends BaseClass{
 
  @Test(groups = "DT" )
  public void deviceTypesCRUD() {
	  String deviceTypes="admin/masterdata/device-types/view";
    Commons.click(driver,By.xpath("//a[@href='#/admin/masterdata']"));
   
    Commons.click(driver,By.id(deviceTypes));
    Commons.click(driver,By.id("Create"));
 

    Commons.enter(driver,By.id("code"),data);
    Commons.enter(driver,By.id("name"),data);
    Commons.enter(driver,By.id("description"),data);
  
    Commons.create(driver);
   	Commons.filter(driver, By.id("name"), data);
   	

   	Commons.edit(driver,data+1,By.id("name"));
   	Commons.filter(driver, By.id("name"), data+1);
   	
   	Commons.activate(driver);
   	Commons.edit(driver,data+2,By.id("name"));
   	Commons.filter(driver, By.id("name"), data+2);
   	Commons.deactivate(driver);

       }
   }
