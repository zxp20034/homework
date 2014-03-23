import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ButtonDropdown {
	public static void main(String[] args) throws InterruptedException{
		WebDriver dr = new ChromeDriver();
		
		File file = new File("src/button_dropdown.html");
		String filePath = "file:///"+file.getAbsolutePath();
		System.out.printf("now access %s \n",filePath);
		
		dr.get(filePath);
		Thread.sleep(1000);
		
//定位text是watir-webdriver的下拉菜单
//首先显示下拉菜单
		dr.findElement(By.linkText("Info")).click();
		
		(new WebDriverWait(dr,10)).until(new ExceptedCondition<Boolean>(){
			public Boolean apply(WebDriver d){
				return d.findElement(By.classNmae("dropdown-menu")).isDisplayed();
				
			}
			
		});
		
//通过ul再次层级定位
		dr.findElement(By.className("dropdown-menu")).findElement(By.linkText("watir-webdriver")).click();
		
		Thread.sleep(1000);
		System.out.println("browser will be close");
		dr.quit();
								
		
	}

}
