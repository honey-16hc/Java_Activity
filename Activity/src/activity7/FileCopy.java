package activity7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) throws Exception {
		
		 FileInputStream inp = null;
        FileOutputStream output = null;
        
        
        try {
        	inp = new FileInputStream("C:\\Users\\Microsoft\\Desktop\\check.txt");
        	 output = new FileOutputStream("C:\\Users\\Microsoft\\Desktop\\output.txt");
         	 
        	 int c;
             while ((c = inp.read()) != -1) {
            
            	 output.write(c);
             }
  
             System.out.println(
                 "copied the file successfully");
         }
  
         finally {
  
           
  
             if (inp != null) {
  
            	 inp.close();
             }
             if (output != null) {
  
            	 output.close();
             }
        	
        }

	}

}
