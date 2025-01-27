package ATB8xVrushabh.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {


    //This class will return a key for us
    //To return a key we will use following code

    public static String readKey(String key)  {
        try
        {

       FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/data.properties");
       Properties p = new Properties();
       p.load(file);
       return p.getProperty(key);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }





    }



}
