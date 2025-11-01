package configurationReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties prop;

    public static String get(String key) {
        if (prop == null) {
            loadProperties();
        }
        return prop.getProperty(key);
    }

    private static void loadProperties() {
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src\\test\\resources\\Properties\\Config,properties");
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
    }
}