import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import java.io.*;
import java.nio.file.Path;
import java.util.Properties;

public class DeleteLater {
  public static void main(String[] args) throws IOException, ConfigurationException {
//    FileInputStream fis;
//    FileOutputStream fos;
//    FileWriter fileWriter = null;
//    File file;
//    Properties prop = new Properties();
//    file = new File("src/test/resources.properties");
//    fis = new FileInputStream(file);
//    prop.load(fis);
//    prop.setProperty("name", "ram");
//    prop.setProperty("site_url", "https" + "" + "://www.cnn.com");
//
//    //fos = new FileOutputStream(file);
//  //  fos = new FileOutputStream(file, false);
//    fileWriter= new FileWriter(file, false);
//    // prop.store(fos, "updated");
//    prop.store(fileWriter, "updated");
//    //fos.close();
  //  File file;
    PropertiesConfiguration pc = new PropertiesConfiguration("src/test/resources.properties");
   // pc.setProperty("main","Jaydev");
    String urlValue = pc.getString("url");
    File file;
    PropertiesConfiguration pc1 = new PropertiesConfiguration("src/test/resources1.properties");
    pc1.setProperty("url",urlValue);
   // System.out.println(pc.getString("url"));
    pc1.save();
  }
}

