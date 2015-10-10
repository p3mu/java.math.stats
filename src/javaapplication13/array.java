/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author pemu
 **/


import java.util.Scanner;
public class array
{
  public static void main(String[]args)
  {
      Scanner scan=new Scanner(System.in);
      int[] List=new int[5];
      for(int i=0; i<List.length;i++)
      {
          System.out.print("Enter your value= ");
          List [i]=scan.nextInt();
      }
      for (int i=0;i<List.length;i++)
      {
          System.out.println(List[i]);
      }
      
      
  
      int sumation=0;
      for(int i=0;i<List.length;i++)
      {
          sumation+=List[i];
      }
      System.out.println("sumation =" +sumation);
       System.out.println("average ="+(sumation/5));
      
      
     
      int maximum=List[0];
      for(int i=1; i<List.length;i++)
	{
	if(List[i]>maximum)
	   {
	    maximum=List[i];
	   }
        }
		
      System.out.println("Maximum value= "+maximum);
                
     
       int minimum=List[0];
       for(int i=1; i<List.length;i++)
	{
		if(List[i]<minimum)
		{
		  minimum=List[i];
		}
        }
		System.out.println("Minimum value= "+minimum);
        
             
   
  }
  
  
}
