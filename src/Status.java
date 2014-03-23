import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Status {
	public static void main(String[] args) throws InterruptedException{
		WebDriver dr = new ChromeDriver();
		
		File file=new File("src/status.html");
		String filePath = "file:///"+file.getAbsolutePath();
		System.out.printf("now access %s \n", filePath);
		
		dr.get(filePath);
		Thread.sleep(1000);
		
		WebElement textField = dr.findElement(By.name("user"));
		System.out.println(textField.isEnabled());
		
//      ֱ����isEnabled����ȥ�жϸ�button�Ļ����صĻ���true
//      ������Ϊbutton��ʹ��css����ȥdisabled�ģ�������������disable
//      ��ʱ����Ҫ�ж���class���Ƿ���disabled��ֵ���ж����Ƿ���disable״̬
		System.out.println(dr.findElement(By.className("btn")).isEnabled());
		
//      ���ص�textField
//      �ж����Ƿ���ʾ
		
		((JavascriptExecutor)dr).executeScript("$(arguments[0].hide()",textField);
		System.out.println(textField.isDisplayed());
		
//      ʹ��click����ѡ��raido
		WebElement radio= dr.findElement(By.name("radio"));
		radio.click();
		System.out.println(radio.isSelected());
		
		try{
			dr.findElement(By.id("nome"));
		}catch(NoSuchElementException e){
			System.out.println("element does not exist");
			
		}
		Thread.sleep(1000);
		System.out.println("browser will be close");
		dr.quit();
		
		
	
	}
	

}
