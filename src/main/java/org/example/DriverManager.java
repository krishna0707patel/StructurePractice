package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Set;

public class DriverManager extends Utils {



    public static final String USERNAME = LoadProp.getProperty("BROWSERSTACK_USERNAME");

    public static final String AUTOMATE_KEY = LoadProp.getProperty("BROWSERSTACK_ACCESS_KEY");


    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    String browserName = LoadProp.getProperty("browser");
    //    String browserName = System.getProperty("browser");

    boolean runIncloud = Boolean.parseBoolean(LoadProp.getProperty("cloud"));


    MutableCapabilities capabilities = new MutableCapabilities();





    // for open browser
    public void openBrowser() {

        // run in cloud===================================================================================

       if (runIncloud)
       {

           System.out.println("Running in cloud");


           // connect to cloud

           if (browserName.equalsIgnoreCase("Edge")) {
               ///connect with browserstack
               capabilities.setCapability("browserName", "Edge");
               capabilities.setCapability("browserVersion", "106.0");
               HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
               browserstackOptions.put("os", "Windows");
               browserstackOptions.put("osVersion", "10");
               browserstackOptions.put("local", "false");
               browserstackOptions.put("seleniumVersion", "4.1.0");
               capabilities.setCapability("bstack:options", browserstackOptions);

           } else if (browserName.equalsIgnoreCase("Firefox"))
           {
               ///connect with browserstack
               capabilities.setCapability("browserName", "firefox");
               capabilities.setCapability("browserVersion", "106.0");
               HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
               browserstackOptions.put("os", "Windows");
               browserstackOptions.put("osVersion", "11");
               browserstackOptions.put("local", "false");
               browserstackOptions.put("seleniumVersion", "4.1.0");
               capabilities.setCapability("bstack:options", browserstackOptions);
           } else if (browserName.equalsIgnoreCase("Safari")) {


               MutableCapabilities capabilities = new MutableCapabilities();
               capabilities.setCapability("browserName", "Safari");
               capabilities.setCapability("browserVersion", "13.1");
               HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
               browserstackOptions.put("os", "OS X");
               browserstackOptions.put("osVersion", "Catalina");
               browserstackOptions.put("local", "false");
               browserstackOptions.put("seleniumVersion", "3.14.0");
               capabilities.setCapability("bstack:options", browserstackOptions);


               try {
                   driver = new RemoteWebDriver(new URL(URL), capabilities);
               } catch (MalformedURLException e)
               {
                   throw new RuntimeException(e);
               }



           } else {
               System.out.println("Your browser name is wrong or missing implementation:" + browserName);
           }




       }
       else
       {

           System.out.println("Running in locally");

           // run locally ====================================================================================


           String browserName = LoadProp.getProperty("browser");

           LoadProp loadProp = new LoadProp();    //Chrome

           if (browserName.equalsIgnoreCase("chrome")) {

               //.setProperty command is used for sets the property of the system which is indicated by a key
               System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");

               // To communicate test scripts with Google Chrome
               driver = new ChromeDriver();

           } else if (browserName.equalsIgnoreCase("edge")) {

               System.setProperty("webdriver.edge.driver", "src/test/java/Drivers/msedgedriver.exe");

               driver = new EdgeDriver();


           } else if (browserName.equalsIgnoreCase("firefox")) {

               System.setProperty("webdriver.gecko.driver", "src/test/java/Drivers/geckodriver.exe");

               driver = new FirefoxDriver();


           } else {
               System.out.println("your browser name is wrong or not supporting or implementation:" + browserName);
           }

       }





        // to maximise the browser window
        driver.manage().window().fullscreen();


        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        //driver.get command used for to open  URL.it will wait till the whole page gets loaded.
        driver.get(LoadProp.getProperty("url"));
    }




        // for closing browser
        public void closeBrowser(){
            driver.quit();

        }

    }
