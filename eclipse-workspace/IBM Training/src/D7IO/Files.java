package D7IO;

import java.io.*;

public class Files 
{
	static void filesList(File[] arr,int level)  
    { 
        for (File f : arr)  
        { 
            for (int i = 0; i < level; i++) 
            {
                System.out.print("--"); 
            }
             
            if(f.isFile())  
            {
                System.out.println(f.getName()); 
            }
            else if(f.isDirectory())  
            {  
                System.out.println(f.getName()); 
                filesList(f.listFiles(), level + 1); 
            } 
        }
    }
	public static void main(String[] args) 
	{
		File file = new File("C:\\Users\\admin\\eclipse-workspace\\");
		
		if(file.isDirectory() && file.exists())
		{
			File f[] = file.listFiles();
			filesList(f,0);
		}
		
	}

}
