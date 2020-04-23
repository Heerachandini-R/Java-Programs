/* Pattern
 	1
 	0	1
 	1	0	1
 	0	1	0	1
 	1	0	1	0
 */
package com.java.heera;
public class Pattern9 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)    // Rows
		{
			for(int j=1;j<=i;j++) // Columns  
			{
				if((i+j)%2==0) //if row no+Column no=even no. it will print 1 or it will print 0
				{
					System.out.print("1 ");
				}
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
}
