package Example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JTextArea;

public class WriteInFile 
{
     
	    public static void WriteStudent ( String n )
		
		{
			File a = new File ("src\\StudentInformation.txt");
			PrintWriter b;
			
			try
			{
				b = new PrintWriter(a);
				b.println(" First Name is : " +n);
				
				//b.println(l);
				//b.println(e);
				//b.println(ce);
				//b.println(p);
				//b.println(cp);
				//b.println(dob);
				//b.println(g);
				//b.println(d);
				
				b.close();
				
			}
			
			catch ( FileNotFoundException z )
			{
				
				z.printStackTrace();
			}
			
		}

		//public static void result(JTextArea tout) 
		//{
			//System.out.println(" juj ");
			
		//}

	

}
