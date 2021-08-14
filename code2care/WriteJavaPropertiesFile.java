package org.code2care;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WriteJavaPropertiesFile {

    public static void main(String... args) throws IOException {

        OutputStream outputStream = new FileOutputStream("config.properties");
        Properties properties = new Properties();

        //Production Environment
        properties.setProperty("prod.db.username","root");
        properties.setProperty("prod.db.password","123456");
        properties.setProperty("prod.domain","https://code2care.org");

        //UAT Environment
        properties.setProperty("uat.db.username","root");
        properties.setProperty("uat.db.password","654321");
        properties.setProperty("uat.domain","https://uat.code2care.org");

        properties.store(outputStream, "This is our prop file!");


    }
}
