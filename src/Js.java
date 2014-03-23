import java.io.File;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js {
	public static void main(String[] args) throws InterruptedException{
		WebDriver dr = new ChromeDriver();
		
		File file = new File("srv/js.html");
		String filePath = "file:///"+file.getAbsolutePath();
		System.out.printf("now access %s \n", filePath);
		
		dr.get(filePath);
		Thread.sleep(1000);
		
//      �ڶ�����ֱ��ִ��js
		((JavascriptExecutor)dr).executeScript("$(��#tooltip).fadeOut();");
		Thread.sleep(1000);
		
//       ���Ѿ���λ��Ԫ����ִ��js
		WebElement button = dr.findElement(By.className("btn"));
		((JavascriptExecutor)dr).executeScript("$(argument[0].fadeOut();",button);
		
		Thread.sleep(1000);
		System.out.println("browser will be close");
		dr.quit();
		
				
		
	}

}
