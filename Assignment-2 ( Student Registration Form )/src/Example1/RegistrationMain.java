package Example1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationMain extends JFrame implements ActionListener

{
 
	private Container c;
	private JLabel title;

	private JLabel FirstName;
	private JTextField TextFirstName;

	private JLabel LastName;
	private JTextField TextLastName;

	private JLabel EmailAddress;
	private JTextField TextEmailAddress;

	private JLabel ConfirmEmailAddress;
	private JTextField TextConfirmEmailAddress;

	private JLabel Password;
	private JTextField TextPassword;

	private JLabel ConfirmPassword;
	private JTextField TextConfirmPassword;

	private JLabel DOB;
	private JComboBox Date;
	private JComboBox Month;
	private JComboBox Year;

	private JLabel Gender;
	private JRadioButton Male;
    private JRadioButton Female;
	private ButtonGroup Gendergroup;
	 
	private JLabel Department ;
	private JRadioButton CSE;
    private JRadioButton EEE;
    private JRadioButton Civil;
    private JRadioButton ECE;
    private JRadioButton ME;
    private JRadioButton Architecture;
    private JRadioButton BBA;
    private ButtonGroup Deptgroup;
     
	 
	 // private JLabel add;  // address er jonno 
	// private JTextArea tadd;   // address er jonno

	private JCheckBox term;  // term hocche terms and condition er jonno tick er place ta
	
	private JButton submit;
	private JButton reset;

	private JTextArea tout;  // tout hocche output show er jonno boro space ta

	private JLabel res;
	private JTextArea resadd;

	private String dates[] =

			{ "Select Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
					"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"

			};

	private String months[] = { "Select Month" ,"January", "February", "March", "April", "May", "June", "July", "August",

			"September", "October", "November", "December" };

	private String years[] = {"Select Year", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990",
			"1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003",
			"2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016",
			"2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029"

	};



	public RegistrationMain()

	{   
		
		setTitle(" Registration Form ");
		setBounds(300, 100, 1150, 1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("             New Student Registration Form ");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		// title.setSize(500, 30);
		// title.setLocation(300, 30);
		title.setBounds(300, 30, 700, 30);    //300,30,300,30
		c.add(title);

		FirstName = new JLabel(" Student First Name :");
		FirstName.setFont(new Font("Arial", Font.PLAIN, 20));
		// Firstname.setSize(100, 100);
		// Firstname.setLocation(100, 100);
		FirstName.setBounds(10, 90, 300, 40);
		c.add(FirstName);

		TextFirstName = new JTextField();
		TextFirstName.setFont(new Font("Arial", Font.PLAIN, 17));
		TextFirstName.setSize(275, 25); // Faka space er size er jonno x, y
		TextFirstName.setLocation(250, 100);
		c.add(TextFirstName);

		LastName = new JLabel(" Student Last Name :");
		LastName.setFont(new Font("Arial", Font.PLAIN, 20));
		// LastName.setSize(300, 20);
		// LastName.setLocation(10, 140);
		LastName.setBounds(10, 130, 300, 40);
		c.add(LastName);

		TextLastName = new JTextField();
		TextLastName.setFont(new Font("Arial", Font.PLAIN, 15));
		TextLastName.setSize(275, 25); // Faka space er size er jonno koto boro choto show korbe
		TextLastName.setLocation(250, 140);
		
		c.add(TextLastName);

		EmailAddress = new JLabel(" Email Address :");
		EmailAddress.setFont(new Font("Arial", Font.PLAIN, 20));
		// EmailAddress.setSize(100, 100);
		// EmailAddress.setLocation(100, 100);
		EmailAddress.setBounds(10, 170, 300, 40);
		c.add(EmailAddress);

		TextEmailAddress = new JTextField();
		TextEmailAddress.setFont(new Font("Arial", Font.PLAIN, 17));
		TextEmailAddress.setSize(275, 25);
		TextEmailAddress.setLocation(250, 180);
		c.add(TextEmailAddress);

		ConfirmEmailAddress = new JLabel(" Confirm Email Address :");
		ConfirmEmailAddress.setFont(new Font("Arial", Font.PLAIN, 20));
		// ConfirmEmailAddress.setSize(100, 100);
		// ConfirmEmailAddress.setLocation(100, 100);
		ConfirmEmailAddress.setBounds(10, 210, 300, 40);
		c.add(ConfirmEmailAddress);

		TextConfirmEmailAddress = new JTextField();
		TextConfirmEmailAddress.setFont(new Font("Arial", Font.PLAIN, 17));
		TextConfirmEmailAddress.setSize(275, 25);
		TextConfirmEmailAddress.setLocation(250, 220);
		c.add(TextConfirmEmailAddress);

		Password = new JLabel(" Password :");
		Password.setFont(new Font("Arial", Font.PLAIN, 20));
		// ConfirmEmailAddress.setSize(100, 100);
		// ConfirmEmailAddress.setLocation(100, 100);
		Password.setBounds(10, 250, 300, 40);
		c.add(Password);

		TextPassword = new JTextField();
		TextPassword.setFont(new Font("Arial", Font.PLAIN, 17));
		TextPassword.setSize(275, 25);
		TextPassword.setLocation(250, 260);
		c.add(TextPassword);

		ConfirmPassword = new JLabel(" Confirm Password :");
		ConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 20));
		// ConfirmEmailAddress.setSize(100, 100);
		// ConfirmEmailAddress.setLocation(100, 100);
		ConfirmPassword.setBounds(10, 290, 300, 40);
		c.add(ConfirmPassword);

		TextConfirmPassword = new JTextField();
		TextConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 17));
		TextConfirmPassword.setSize(275, 25);
		TextConfirmPassword.setLocation(250, 300);
		c.add(TextConfirmPassword);


		
		  DOB= new JLabel(" Date Of Birth : "); 
		  DOB.setFont(new Font("Arial", Font.PLAIN, 20));
		  //DOB.setSize(100, 20); 
		  //DOB.setLocation(100, 250); 
		  DOB.setBounds(10, 330, 300, 40);
		  c.add(DOB);
		 
		  
		 Year = new JComboBox(years); 
		 Year.setFont(new Font("Arial", Font.PLAIN, 17));
		 Year.setSize(120, 20); 
		 Year.setLocation(250, 340); 
		 c.add(Year);
		  
		 Month = new JComboBox(months);
		 Month.setFont(new Font("Arial", Font.PLAIN,16));
		 Month.setSize(120, 20); 
		 Month.setLocation(400, 340); 
		 c.add(Month);
		 
		 Date = new JComboBox(dates); 
		 Date.setFont(new Font("Arial", Font.PLAIN,17));
		 Date.setSize(120, 20); 
		 Date.setLocation(550, 340); 
		 c.add(Date);
		 
		 
          Gender = new JLabel(" Gender : "); 
		  Gender.setFont(new Font("Arial", Font.PLAIN,20));
		  //Gender.setSize(100, 20); 
		  //Gender.setLocation(100, 200); 
		  Gender.setBounds(10, 370, 400, 40);
		  c.add(Gender);
		  
		  Male = new JRadioButton(" Male "); 
		  Male.setFont(new Font("Arial", Font.PLAIN,20)); 
		  Male.setSelected(false); 
		  Male.setSize(150, 20); //75,20
		  Male.setLocation(250,380); 
		  c.add(Male);
		  
		  Female = new JRadioButton(" Female "); 
		  Female.setFont(new Font("Arial",Font.PLAIN, 20));
		  Female.setSelected(false); 
		  Female.setSize(150, 20);
		  Female.setLocation(420, 380);
		  c.add(Female);
		  
		  Gendergroup = new ButtonGroup(); 
		  Gendergroup.add(Male); 
		  Gendergroup.add(Female);
		  
		  
		  Department = new JLabel(" Department : "); 
		  Department.setFont(new Font("Arial", Font.PLAIN,20));
		  //Gender.setSize(100, 20); 
		  //Gender.setLocation(100, 200); 
		  Department.setBounds(10, 410, 200, 40);
		  c.add(Department);
		  
		  CSE = new JRadioButton(" Computer Science And Engineering (CSE) "); 
		  CSE.setFont(new Font("Arial", Font.PLAIN,20)); 
		  CSE.setSelected(false); 
		  CSE.setSize(450, 20); //350,20 chilo
		  CSE.setLocation(250,423); 
		  c.add(CSE);
		  
		  EEE = new JRadioButton(" Electrical And Electronic Engineering (EEE) "); 
		  EEE.setFont(new Font("Arial", Font.PLAIN,20)); 
		  EEE.setSelected(false); 
		  EEE.setSize(450, 20); 
		  EEE.setLocation(250,450); 
		  c.add(EEE);
		  
		  Civil = new JRadioButton(" Civil Engineering "); 
		  Civil.setFont(new Font("Arial", Font.PLAIN,20)); 
		  Civil.setSelected(false); 
		  Civil.setSize(450, 20); 
		  Civil.setLocation(250,477); 
		  c.add(Civil);
		  
		  ME = new JRadioButton(" Mechanical Engineering (ME) "); 
		  ME.setFont(new Font("Arial", Font.PLAIN,20)); 
		  ME.setSelected(false); 
		  ME.setSize(450, 20); 
		  ME.setLocation(250,504); 
		  c.add(ME);
		  
		  Architecture = new JRadioButton(" Architecture "); 
		  Architecture.setFont(new Font("Arial", Font.PLAIN,20)); 
		  Architecture.setSelected(false); 
		  Architecture.setSize(450, 20); 
		  Architecture.setLocation(250,531); 
		  c.add(Architecture);
		  
		  BBA = new JRadioButton(" BBA "); 
		  BBA .setFont(new Font("Arial", Font.PLAIN,20)); 
		  BBA .setSelected(false); 
		  BBA .setSize(300, 20); 
		  BBA .setLocation(250,558); 
		  c.add(BBA );
		  
		  Deptgroup = new ButtonGroup(); 
		  Deptgroup.add(CSE); 
		  Deptgroup.add(EEE);
		  Deptgroup.add(Civil); 
		  Deptgroup.add(ME);
		  Deptgroup.add(Architecture); 
		  Deptgroup.add(BBA);
		  
		  
		  /**
		 * add = new JLabel("Address"); add.setFont(new Font("Arial", Font.PLAIN, 20));
		 * add.setSize(100, 20); add.setLocation(100, 300); c.add(add);
		 * 
		 * tadd = new JTextArea(); tadd.setFont(new Font("Arial", Font.PLAIN, 15));
		 * tadd.setSize(200, 75); // box er sixe show kore tadd.setLocation(200, 300);
		 * // x , y axis theke koto doore ase //tadd.setLineWrap(true); c.add(tadd);
		 **/

		term = new JCheckBox(" Accept Terms And Conditions "); // accept er jonno check box
		term.setFont(new Font("Arial", Font.PLAIN, 25));//15 chilo
		term.setSize(400, 20); //250,20
		term.setLocation(150, 650); 
		c.add(term);

		submit = new JButton("Submit");
		submit.setFont(new Font("Arial", Font.PLAIN, 20));
		submit.setSize(100, 20);
		submit.setLocation(150, 700);
		submit.addActionListener(this);
		c.add(submit);

		reset = new JButton("Cancel");  // cancel er bodole reset deya jay 
		reset.setFont(new Font("Arial", Font.PLAIN, 20));
		reset.setSize(100, 20);
		reset.setLocation(270, 700);
		reset.addActionListener(this);
		c.add(reset);

		tout = new JTextArea("                Tour Data Is Below : ");
		tout.setFont(new Font("Arial", Font.PLAIN, 20));
		tout.setSize(380, 450); // it was 300 or 250
		tout.setLocation(730, 385); //680,385
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 25));
		res.setSize(700, 25);
		res.setLocation(100, 750);
		c.add(res);

		resadd = new JTextArea();
		resadd.setFont(new Font("Arial", Font.PLAIN, 20));
		resadd.setSize(200, 75);
		resadd.setLocation(750, 505); // tout er vitore j faka space ta hide thake setar jonno size
		resadd.setLineWrap(true);
		c.add(resadd);

		setVisible(true);  //  true means frame ta dekha jave false hole frame ta dekha jeto na
	}

	
	
	public void actionPerformed(ActionEvent e)

	{
		if (e.getSource() == submit) 
		
		{
			if (term.isSelected()) 
			
			{
				String data1 = " First name : " + TextFirstName.getText() + "\n" + "\n"
				        + " Last Name : "+ TextLastName.getText() + "\n" + "\n"
						+ " Email : " + TextEmailAddress.getText() + "\n" + "\n"
						+ " Verified : " + TextConfirmEmailAddress.getText() + "\n" + "\n"
						+ " Password : " + TextPassword.getText() + "\n" + "\n"
						+ " Confirmed Password  : " + TextConfirmPassword.getText() + "\n" + "\n";
				       // WriteInFile.WriteStudent(TextFirstName);
				        
				
				String data2 = " Date Of Birth : " + (String)Year.getSelectedItem() 
				  + " - " + (String)Month.getSelectedItem() 
				  + " - " + (String)Date.getSelectedItem() + "\n" + "\n"; 
				
			 
				String data3;
				
				if (Male.isSelected())
					 
				 {
				  data3 = " Gender : Male" + "\n" + "\n";
				 }
				 
			     else if (Female.isSelected())
			    	 
			     {	 
				   data3 = " Gender : Female" + "\n" + "\n";
			     }
				
			     else
			     {
			    	 data3 = " Gender : Not Selected " + "\n" + "\n";
			    	 
			     }
				 
				 
				
				 String data4;  
				 
				 if (CSE.isSelected()) // condition to select department
					 
				 {
				 data4 = " Department : CSE " + "\n" + "\n";
				 }
				 
				 else if  (EEE.isSelected())
			    	 
			     {	 
				  data4 = " Department : EEE " + "\n" + "\n";
			     }
			     
				 else if (Civil.isSelected())
			    	 
			     {	 
				  data4 = " Department : Civil " + "\n" + "\n";
			     }
                 
				 else if (ME.isSelected())
			    	 
			     {	 
				  data4 = " Department : ME " + "\n" + "\n";
			     }
                 
				 else if (Architecture.isSelected())
			    	 
			     {	 
				  data4 = " Department : Architecture " + "\n" + "\n";
			     }
                 
                 else if (BBA.isSelected())
                 {	 
   				  data4 = " Department : BBA " + "\n" + "\n";
   			     } 
				 
                 else
                 {
                	 
                	 data4 = " Department :  Not Selected  ";
                 }
                
				 
			     
				 
				// String data5 = "Address : " + tadd.getText();
				// tout.setText(data + data1 + data2 + data3 +data4 + data5);
				// tout.setText(data + data2 + data3);
				//tout.setText(data + data3);
				tout.setText(data1 + data2 +  data3 + data4);
				tout.setEditable(false);
				res.setText("        Registration  Done Successfully ...");
				
				//WriteInFile.WriteNumber(FirstName);
				
			} 
			
			else 
			{
				tout.setText("");
				resadd.setText("");
				res.setText("        Please Accept The Terms And Conditions...");
			}
			
		}

		else if (e.getSource() == reset) 
		
		{
			String def = "";
			TextFirstName.setText(def);
            // tadd.setText(def);
			TextLastName.setText(def);
			TextEmailAddress.setText(def);
			TextConfirmEmailAddress.setText(def);
			TextPassword.setText(def);
			TextConfirmPassword.setText(def);
			
			res.setText(def);
			tout.setText(def);
			term.setSelected(false);
			Year.setSelectedIndex(0);
			Month.setSelectedIndex(0);
			Date.setSelectedIndex(0);
			/**Male.setText(def);
			Female.setText(def);
			CSE.setText(def);
			EEE.setText(def);
			Civil.setText(def);
			ME.setText(def);
			Architecture.setText(def);
			BBA.setText(def);**/
			
		    
		   resadd.setText(def);
			
			
		}
	}

	public static void main(String[] args)

	{

		RegistrationMain f = new RegistrationMain();
		
	}

}
