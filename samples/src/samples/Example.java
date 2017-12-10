package samples;

import java.io.*;
import java.util.Map;

// Download the snakeYaml jar at: http://code.google.com/p/snakeyaml/downloads/list
//import org.yaml.snakeyaml.Yaml;


public class Example {

      
   public static void main(String[] args) {
      
      // The path of your YAML file.
      final String fileName = "path\\to\\yaml\\file\\test.yaml";
      
    //  Yaml yaml = new Yaml();
   
      try {
         InputStream ios = new FileInputStream(new File(fileName));
         
         // Parse the YAML file and return the output as a series of Maps and Lists
        // Map<String,Object> result = (Map<String,Object>)yaml.load(ios);
        //
         
         
         
         .args.System.out.println(result.toString());
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
