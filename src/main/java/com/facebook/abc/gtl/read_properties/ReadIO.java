package com.facebook.abc.gtl.read_properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadIO {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src\\main\\resources\\application.properties");
            Properties prop = new Properties();
            prop.load(fis);

            // Reading:
            String username = prop.getProperty("url");
            System.out.println(username);

        } catch (FileNotFoundException e) {
            // Logic in this case
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
