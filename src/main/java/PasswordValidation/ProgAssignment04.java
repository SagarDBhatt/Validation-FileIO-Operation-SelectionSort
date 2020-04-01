
/*********************************************************************
//*																	*
//*						 CIS611 Spring 2019 						*
//* 						Sagar Bhatt 							* 
//* 																*
//* 					Program Assignment PA04						*
//* 																*
//* 					Class Description 							*
//* 																*
//* 																*
//* 					Date Created 03/1/2019 						*
//* 																*
//* 					Saved in: SBHATTPA04						* 
//*																	*
//*********************************************************************/




package PasswordValidation;

import javax.swing.JOptionPane;

public class ProgAssignment04 
{

	public static boolean isValidPassword(String pwd)
	{
		int counter = 0;
		
		if( pwd.length() < 8 )
		{
			return false;
		}
		
		for (int i = 0; i < pwd.length(); i++)
		{
			if (Character.isDigit(pwd.charAt(i)))
			{
				counter += 1; 
			}
		}	
	
		if (counter < 2)
		{	
			return false;
		
		}//End of Else if 1. 
		
		else if ( !(pwd.contains("%") || pwd.contains("&") || pwd.contains("#")) )
		{
			return false;
		}// End of else if 2.
		
		else 
		{
			return true; 
			
		}//End of final Else 
		
	}//End of Method isValidPassword
	
	public static void main(String[] args) 
	{
		String pwdString = JOptionPane.showInputDialog("Enter a string for password : "); 
		
		
		 if ( isValidPassword(pwdString) )
		 {
			 JOptionPane.showMessageDialog(null, "Valid Password");
		 }
		 
		 else 
		 {
			 JOptionPane.showMessageDialog(null, "Invalid Password");
		 }
		 
		 int cont = JOptionPane.showConfirmDialog(null, "Continue Entering the password? ");
		 
		 while (cont == 0)
		 {
			 pwdString = JOptionPane.showInputDialog("Enter a string for password : ");
			 
			 if ( isValidPassword(pwdString) )
			 {
				 JOptionPane.showMessageDialog(null, "Valid Password");
			 }
			 
			 else 
			 {
				 JOptionPane.showMessageDialog(null, "Invalid Password");
			 }
			 
			 cont = JOptionPane.showConfirmDialog(null, "Continue Entering the password? ");
			 
		 }
		 
	}//End of Main

}//End of Class
