package mylisten;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import javax.servlet.http.*;


public class AttListener implements HttpSessionAttributeListener 
{
public void attributeAdded(HttpSessionBindingEvent sessionBindingEvent) 
{


      if(sessionBindingEvent.getName().compareTo("xmlAttribute")==0)
      {
          attributepp("/usr/share/apache-tomcat-7.0.32/webapps/hw3/txtOfListen/xmlattr.txt");
      }
      else if (sessionBindingEvent.getName().compareTo("uploadAttribute")==0)
      {
          attributepp("/usr/share/apache-tomcat-7.0.32/webapps/hw3/txtOfListen/uploadatrr.txt");
      }

} 

    @Override
public void attributeRemoved(HttpSessionBindingEvent sessionBindingEvent) {} 
    
    @Override
public void attributeReplaced(HttpSessionBindingEvent sessionBindingEvent) 
    {

if(sessionBindingEvent.getName().compareTo("xmlAttribute")==0)
      {
          attributepp("/usr/share/apache-tomcat-7.0.32/webapps/hw3/txtOfListen/xmlattr.txt");
      }
}



 public static String getTxTNums(String suffix){
  
  String prefix = "/usr/share/apache-tomcat-7.0.32/webapps/hw3/txtOfListen/";
  String myFile =  prefix + suffix;
  
  
  String DataLine = "";
    try {
      File inFile = new File(myFile);
      BufferedReader br = new BufferedReader(new InputStreamReader(
          new FileInputStream(inFile)));

      DataLine = br.readLine();
      br.close();
    } catch (FileNotFoundException ex) {
      return (null);
    } catch (IOException ex) {
      return (null);
    }
    return (DataLine);
  }
  
  
 
 public void attributepp(String str){
  
  String DataLine = "";
    try {
      File inFile = new File(str);
      BufferedReader br = new BufferedReader(new InputStreamReader(
          new FileInputStream(inFile)));
        
                DataLine = br.readLine();

              br.close();
    } catch (FileNotFoundException ex) {
      
    } catch (IOException ex) {
      
    }
    

    int i=Integer.parseInt(DataLine);
    i++;
    
   
     Writer writer = null;
 
        try {
            String text = Integer.toString(i);
            String myFileName = str;
            File file = new File(myFileName);
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(text);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.flush();
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
  }






}