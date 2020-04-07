package Example3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Write
{
	
	
	public static void WriteStuudent(String fname,String lname)
	
	{
	
	File file = new File("src\\ResultStudent.txt");
	//Print Writer
	PrintWriter out;
	try {
		out = new PrintWriter(file);
		out.println("First Name  "+fname);
		out.println("Last Name "+lname);
	
		out.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	}

}
