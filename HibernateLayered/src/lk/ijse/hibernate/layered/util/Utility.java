package lk.ijse.hibernate.layered.util;

/*
    @author THINUX
    @created 25-Mar-23 - 10:21 
*/

import java.io.IOException;
import java.util.Properties;

public class Utility {

    public static Properties getProperties(){
        Properties properties = new Properties();

        try {
            properties.load(ClassLoader
                    .getSystemClassLoader().getResourceAsStream("hibernate.hibernate.properties"));
        } catch (IOException e) {
            System.out.println("Property file not found!");
            e.printStackTrace();
        }
        return properties;
    }
}
