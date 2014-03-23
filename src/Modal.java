import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Modal {
	public static void main(String[] args) throws InterruptedException{
		WebDriver dr = new ChromeDriver();
		
		File file = new File("src/modal.html");
		String filePath = "file:///"+file.getAbsolutePath();
		System.out.printf("now access %s \n",filePath);
		
		dr.get(filePath);
		Thread.sleep(1000);
		
//�򿪶Ի���
		dr.findElement(By.id("show_modal")).click();
		
		(new WebDriverWait(dr,10)).until(
				new ExpectedCondition<Boolean>(){
					public Boolean apply(WebDriver d){
						return d.findElement(By.id("myModal")).isDisplayed();	
					}
				});
//      ����Ի����е�����
//       ���ڶԻ����е�Ԫ�ر��ɰ����ڵ���ֱ�ӵ���ᱨ Element is not clickable�Ĵ���
//       ����ʹ��js��ģ��click
//       ��watir-webdriver��ֻ��Ҫfire_event(:click)�Ϳ�����
		WebElement link = dr.findElement(By.id("myModal")).findElement(By.id("click"));
		((JavascriptExecutor)dr).executeScript("$(argument[0].click()",link);
		
		Thread.sleep(1000);
		System.out.println("browser will be close");
		dr.quit();
				
	}

}
