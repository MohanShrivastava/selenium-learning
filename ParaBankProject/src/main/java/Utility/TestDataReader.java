package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class TestDataReader {
    //make function which can read .property type of files
    //make prop class
    //.prop has keys n value
    //if statis we do not have to make object
    public static Properties readProperties(String fileName) {
        Properties p=null;
        try {
            FileInputStream fr = new FileInputStream(Constants.PATH+fileName);
            p = new Properties();
            p.load(fr);
        } catch (Exception e) {}
          return p;
    }
}
