package com.hillel.java.property;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by EKarpenko on 04.06.2015.
 */
public class PropertyMain {
    public static void main(String[] args) {
        Properties mainProperties = getProperties("fileToLoad.properties");
        String filePath = mainProperties.getProperty("fileToLoad");
        Properties emergencyProperties = getProperties(filePath);

        System.out.println(emergencyProperties.getProperty("police"));
        System.out.println(emergencyProperties.getProperty("ambulance"));
    }

    private static Properties getProperties(String path) {
        Properties properties = new Properties();

        try (FileReader reader = new FileReader(path)) {
            properties.load(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
