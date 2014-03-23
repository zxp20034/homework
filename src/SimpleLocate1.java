import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


public class SimpleLocate1 {
	public static void main(String[] args) throws InterruptedException{
		WebDriver dr = new ChromeDriver();
		
		File file = new File("src/checkbox.html");
		String filePath = "file:///"+file.getAbsolutePath();
		System.out.printf("now access %s \n",filePath);
		
		dr.get(filePath);
		Thread.sleep(1000);
//   ѡ�����е�checkbox��ȫ������
		List<WebElement> checkboxes = dr.findElements(By.cssSelector("input[type=checkbox]"));
		
		for(WebElement checkbox : checkboxes){
			checkbox.click();		
		}
		dr.navigate().refresh();
//   ��ӡ��ǰҳ�����ж��ٸ�checkbox
		System.out.printf("%d\n",checkboxes.size());
		
//   ѡ��ҳ�������е�input,Ȼ����й��˳����е�checkbox����ѡ֮
		List<WebElement> inputs = dr.findElements(By.tagName("input"));
		for(WebElement input:inputs){
			if(input.getAttribute("type").equals("checkbox")){
				input.click();
				
			}
		}
//��ҳ�������1��checkbox�Ĺ���ȥ��
		List<WebElement> allCheckboxes = dr.findElements(By.cssSelector("input[type=checkbox]"));
		allCheckboxes.get(allCheckboxes.size() - 1).click();
		
		Thread.sleep(1000);
		System.out.println("browser will be close");
		dr.quit();
		
	}

}
