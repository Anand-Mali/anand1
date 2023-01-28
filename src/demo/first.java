package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class first {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\seljar\\chromedriver\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("http://www.google.com");
         Thread.sleep (2000);
         driver.manage().window().maximize();
         driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Anand mali");
         Thread.sleep(3000);
         driver.close();
	}

}
