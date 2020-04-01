
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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Sort {

	public static void selectionSort(double[] pPrice, String[] pName)
	{
		
		for (int i = 0; i < pPrice.length - 1; i++)
		{
			double currentMin = pPrice[i];
			String currentMinInfo = pName[i]; 
			int currentMinIndex = i; 
			
			
			for (int j = i + 1; j < pPrice.length; j++)
			{
				
				if(currentMin > pPrice[j])
				{
					currentMin = pPrice[j]; 
					currentMinInfo = pName[j];
					currentMinIndex = j;
				}
			
			}//End of J loop
			
				if (currentMinIndex != i)
				{
					pPrice[currentMinIndex] = pPrice[i]; 
					pPrice[i] = currentMin;
					
					pName [currentMinIndex] = pName [i];
					pName [i] = currentMinInfo;
				}
				
			}// End of I loop
			
			
		JOptionPane.showMessageDialog(null,"Sorting of Array completed successfully");
		
		}// End of method SelectionSort

	}//End of Class
