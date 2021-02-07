package ReusableFiles;

import java.io.IOException;
import java.util.Properties;
import java.io.FileInputStream;

public class Utilities {

    static Properties prop;
    static FileInputStream input = null;
    /************
     * Reading values from Properties file
     *
     * @param KeyName
     * @return KeyValue
     * @throws IOException
     */
    public static String ReadPropertiesFile(String KeyName) throws IOException {
        prop=new Properties();
        String KeyValue = null;
        input = new FileInputStream("src/main/resources/Config/MyConfig.properties");

        // load a properties file
        prop.load(input);

        // get the property value and print it out
        KeyValue = prop.getProperty(KeyName);

        return KeyValue;
    }
}
