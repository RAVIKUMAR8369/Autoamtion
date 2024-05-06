package TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Xpathcode {
    public static String getxpath(String key) {
     try{
         File file=new File("C:\\Users\\Ravi8\\IdeaProjects\\Auto\\src\\main\\resources\\xpath.properties");
         InputStream fileinputstream=new FileInputStream(file);
         Properties properties=new Properties();
         properties.load(fileinputstream);
         return properties.getProperty(key);
     }catch (Exception e){
         e.printStackTrace();
     }
     return null;
    }
}

