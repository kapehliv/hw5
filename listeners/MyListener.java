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

public class MyListener implements HttpSessionListener {
  static int users = 0;

    @Override
  public void sessionCreated(HttpSessionEvent e) {
    users++;
    visitpp();
    
  }
    @Override
  public void sessionDestroyed(HttpSessionEvent e) {
     if(users>0){
      users--;
    }
  }
  public static int getAliveSessions() {
    return users;
  
  }
  
  
 
  
    public void visitpp(){
  
  
      
      String DataLine = "";
    try 
    {
        File inFile = new File("/usr/share/apache-tomcat-7.0.32/webapps/hw3/txtOfListen/visitNum.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(inFile)));

        DataLine = br.readLine();
        br.close();
    } catch (FileNotFoundException ex) {} 
        catch (IOException ex) {}
  

    int i=Integer.parseInt(DataLine);
    i++;
    
     Writer writer = null;
 
        try {
            String text = Integer.toString(i);
            String myFileName = "/usr/share/apache-tomcat-7.0.32/webapps/hw3/txtOfListen/visitNum.txt";
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







