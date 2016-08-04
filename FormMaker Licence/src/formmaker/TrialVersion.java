
package formmaker;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TrialVersion {
    TrialVersion()
    {
        ram();
    }

  
    static String key="shiv123";
    static int days=3;
    static void write()
    {
        try{
            
        File ff=new File("C:\\ProgramData\\trial");
        ff.mkdirs();
            
        FileOutputStream fout;
        fout=new FileOutputStream("C:\\ProgramData\\trial\\key.txt");
        byte arr1[]=key.getBytes();
        fout.write(arr1);
        fout.close();
        
        fout=new FileOutputStream("C:\\ProgramData\\trial\\isKey.txt");
        byte arr2[]=(false+"").getBytes();
        fout.write(arr2);
        fout.close();
        
        Date d=new Date();
        long dd=d.getTime(); 
        String data="";
        days++;
        for(int i=0;i<days;i++)
        {
            data=data+(dd+86400000*i)+"@"+(days-i)+"@";
        }
        fout=new FileOutputStream("C:\\ProgramData\\trial\\date.txt");
        byte arr3[]=(data).getBytes();
        fout.write(arr3);
        fout.close();
        
        System.out.println("File Written Successfully");
    }catch(Exception e){System.out.println(e);}
    }
    
    public static void ram() {
        try{
            FileInputStream fin=new FileInputStream("C:\\ProgramData\\trial\\isKey.txt");
            int i;
            String ss="";
            while((i=fin.read())!=-1)
                ss=ss+(char)i;
            boolean b=Boolean.parseBoolean(ss);
            if(b)
                new FormMakerGUI().setVisible(true);
            else
            {
                System.out.println("Key Not Found!!");
                new TWin().setVisible(true);
            }
        }catch(Exception e)
        {
            write();
            new TWin().setVisible(true);
        }
         
    }
    
}
