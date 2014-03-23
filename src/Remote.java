//We could use any driver for our tests...
DesiredCapabilities capabilities = new DesiredCapabilities();

//...but only if it supports javascript
capabilities.setJavascriptEnabled(true);

//Get a handle to the driver.This will throw an exception
//if a matching driver cannot be located
WebDriver driver = new RemoteWebDriver(capabilites);

//Query the driver to find out more information
Capabilities actualCapabilities = ((RemoteWebDriver)driver).getCapabilities();

//And now use it
driver.get("http://www.google.com");

