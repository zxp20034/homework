//package org.coderinfo.demo;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeBrowser {
	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().setSize(new Dimension(600,400));
		driver.get("http://www.google.com.hk");
		try{
			Thread.sleep(5000);
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
