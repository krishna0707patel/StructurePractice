package org.example;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp
{


    static Properties prop;
//    static String propertiesFileLocation = "src/test/java/TestConfig/";
//    static String propertiesFileName = "TestData.properties";
    static FileInputStream input;

    public static String getProperty(String key) {
        prop = new Properties();
        try {
//            input = new FileInputStream(propertiesFileLocation + propertiesFileName);
            input = new FileInputStream("src/test/java/TestConfig/TestData.properties");
            prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);

    }

    @Test
    public void readKeys() {
        // DriverManager class with edit url
        System.out.println(getProperty("url"));

        // Register class with edit registration details
        System.out.println(getProperty("firstname"));
        System.out.println(getProperty("lastname"));
        System.out.println(getProperty("emailpart1"));
        System.out.println(getProperty("emailpart2"));
        System.out.println(getProperty("birthday"));
        System.out.println(getProperty("birthmonth"));
        System.out.println(getProperty("birthyear"));
        System.out.println(getProperty("password"));
        System.out.println(getProperty("confirmpassword"));

        //macbook email a friend

        System.out.println(getProperty("friendemailpart1"));
        System.out.println(getProperty("friendemailpart2"));
        System.out.println(getProperty("personalmessagemacbook"));



        // nike product
        System.out.println(getProperty("ProductName"));


    }



}
