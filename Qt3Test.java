// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Qt3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void qt3() {
    driver.get("http://localhost:3000/#!/");
    driver.manage().window().setSize(new Dimension(773, 712));
    driver.findElement(By.cssSelector(".ng-scope:nth-child(1) > td .input-group-append > .btn")).click();
    vars.put("total", driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText());
    System.out.println("total= vars.get("total").toString()");
    assertEquals(vars.get("total").toString(), "€1.25");
    driver.findElement(By.cssSelector(".ng-scope:nth-child(2) > td .input-group-append > .btn")).click();
    vars.put("total", driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText());
    System.out.println("total = vars.get("total").toString()");
    assertEquals(vars.get("total").toString(), "€3.25");
    driver.findElement(By.cssSelector(".ng-scope:nth-child(3) .input-group-append > .btn")).click();
    vars.put("total", driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText());
    System.out.println("total = vars.get("total").toString()");
    assertEquals(vars.get("total").toString(), "€6.25");
    driver.findElement(By.cssSelector(".btn-success")).click();
    driver.findElement(By.id("ageInput")).click();
    driver.findElement(By.id("ageInput")).sendKeys("21");
    driver.findElement(By.cssSelector(".btn-success")).click();
  }
}
