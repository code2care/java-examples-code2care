package org.code2care;

import java.io.*;
import java.util.Properties;

class ReadJavaPropertiesFile {

    public static void main(String... args) throws IOException {

        InputStream inputStream = new FileInputStream("config.properties");

        Properties properties = new Properties();
        properties.load(inputStream);

        System.out.println(properties.getProperty("uat.db.password"));
        System.out.println(properties.getProperty("prod.db.password"));
        System.out.println(properties.getProperty("prod.domain"));

    }
}
