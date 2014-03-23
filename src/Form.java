import java.io.File;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Form {
	public static void main(String[] args) throws InterruptedException{
		WebDriver dr = new ChromeDriver();
		
		File file=new File("src/form1.html");
		String filePath="file:///"+file.getAbsolutePath();
		System.out.printf("now access %s \n", filePath);
		
		dr.get(filePath);
		Thread.sleep(1000);
		
//      ѡ��checkbox
		dr.findElement(By.cssSelector("input[type=checkbox]")).click();
		Thread.sleep(1000);
		
//      ѡ��radio
		dr.findElement(By.cssSelector("input[type=radio")).click();
		
//      ѡ�������˵��е����һ��
		List<WebElement> options = dr.findElement(By.tagName("select")).findElements(By.tagName("option"));
		options.get(options.size()-1).click();
		Thread.sleep(1000);
//      ����ύ��ť
		dr.findElement(By.cssSelector("input[type=submit"])).click();
		
		Alert alert=dr.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		Thread.sleep(1000);
		System.out.println("browser will be close");
		dr.quit();
		
		
		
		
	}

}
