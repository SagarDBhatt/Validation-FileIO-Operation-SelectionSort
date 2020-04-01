/*

Purpose: Validating input string of password.

Criteria: A password must have at least eight characters.

		A password consists of any sequence of letters and digits, as well as at least one special characters.
		You will code (and test) for only these three special characters, which are %, &, #.
		You are not required to code to account for any other special character, other than these three.

		A password must contain at least two digits.
*/

package PasswordValidation;
import javax.swing.JOptionPane;

public class PasswordValidator
{
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

}//End of Class
