﻿driver=Slenium::WebDriver.for:chrome,:profile=>profile
#for firfox
FirefoxProfile firefoxProfile=new FirefoxProfile();

firefoxProfile.setPreference("browser.download.folderList",2);
firefoxProfile.setPreference("browser.download.manager.showwhenStarting",false);
firefoxProfile.setPreference("browser.download.dir","c:\\downloads");
firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/csv");

WebDriver driver = new FirefoxDriver(filefoxProfile);
//new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capability);

driver.navigate().to("http:www.myfile.com/hey.csv);
