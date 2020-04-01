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




package SortingWithIOOperations;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Product 
{

	public static void main(String[] args) throws IOException  
	{
		String fpath = null;
		String[] pName = null;
		double[] pPrice = null;
		
		try 
		{
			int numProducts = 50; 
			fpath = JOptionPane.showInputDialog("Enter the File Path : "); //Selecting file to read data. 
			pName = new String[numProducts];
			pPrice = new double[numProducts];
		} 
		
		catch (NullPointerException e)
		{
			System.out.println("Please enter valid file Path : ");
		} 
		
		readFromFile(pName, pPrice, fpath);  //Calling readFromFile method to read data
		sortArrays(pPrice, pName);
		
	}//End of Main
	
	
	public static void readFromFile(String[] pName, double[] pPrice, String filename) throws FileNotFoundException
	{
		
		Scanner scan = new Scanner(new File(filename));
		int counter = 0;
		
		while (scan.hasNextLine() && counter < pName.length)
		{
			
			String line = scan.nextLine();
            String[] details = line.split(",");

			pName[counter] = details[0];
			pPrice[counter] = Double.parseDouble(details[1]);
			counter += 1; 
	
		}//End of While
		
		JOptionPane.showMessageDialog(null, "File Reading successful");
		
		String string_output = "";
		
		for(int i = 0; i < pName.length; i++) 
		{
			string_output = string_output +"  " + pName[i] + "  " + pPrice[i] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, string_output, "Read File Content", JOptionPane.INFORMATION_MESSAGE);
		
	}//End of method readFromFile

	public static void sortArrays(double[] pPrice, String[] pName)
	{
		Sort.selectionSort(pPrice,pName);
		
		String string_output = "";
		
		for(int i = 0; i < pName.length; i++) 
		{
			string_output = string_output + "  " + pName[i] + "  " + pPrice[i] + "\n";
		}

		writeToFile(pName, pPrice);
	
	}//End of method sortArrays
	
	public static void writeToFile(String [] pName, double [] pPrice)
	{
		String fileContent = "";
		
		for(int i = 0; i < pName.length; i++) 
		{
			fileContent = fileContent + pName[i] + "," + pPrice[i] + "\n";
		}
		
		try {
	     
	    FileWriter fileWriter = new FileWriter("sortedProducts.txt");
	    fileWriter.write(fileContent);
	    fileWriter.close();
		}
		
		catch (Exception e) 
		{
			System.out.println("file not found");
		}
			
			String output = "";
			for(int i = 0; i < pName.length; i++) 
			{
				output = output + "  " + pName[i] + "  " + pPrice[i] + "  " + "\n";
			}	
			
			JOptionPane.showMessageDialog(null, output, "Sorted Array", JOptionPane.INFORMATION_MESSAGE);

	}//End of method WriteToFile
	
	
}//End of Class Product


	


//End of Product

// File Path ::  U:\\Spring 2019\\CIS_611_Java\\Eclipse_WorkSpace\\CIS611_PPA_Bhatt_Sagar\\src\\PA04\\products.txt
