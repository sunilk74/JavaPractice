package com.sunil.javapractice;

public class Pyramids {

	public String pyramid1(int rows)
	{
		String str = null;
		if(rows==0)
		{
			str = "Number of rows cannot be zero";
		}
		else if(rows<0)
		{
			str = "Number of rows cannot be negative";
		}
		else if(rows>0)
		{
			System.out.println("=====Pyramid1=====");
			int rowCount = 1;
			for(int i=rows; i>0; i--)
			{
				for(int j =1;j<i; j++)
				{
					System.out.print(" ");
				}
				for(int k=1; k<=rowCount; k++)
				{
					System.out.print(rowCount+" ");
				}
				System.out.println("");
				rowCount++;
			}
			
			str = "PASS";
			System.out.println("=====Pyramid1=====");
		}
		
		return str;
	}
	
	public String pyramid2(int rows)
	{
		String str = null;
		if(rows==0)
		{
			str = "Number of rows cannot be zero";
		}
		else if(rows<0)
		{
			str = "Number of rows cannot be negative";
		}
		else if(rows>0)
		{
			System.out.println("=====Pyramid2=====");
			int rowCount = 1;
			for(int i = rows; i>0; i--)
			{
				for(int j=1;j<i;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=rowCount;k++)
				{
					System.out.print("* ");
				}
				
				System.out.println("");
				rowCount++;
			}
			
			str = "PASS";
			System.out.println("=====Pyramid2=====");
		}
		
		return str;
	}
	
	public String pyramid3(int rows)
	{
		String str = null;
		if(rows==0)
		{
			str = "Number of rows cannot be zero";
		}
		else if(rows<0)
		{
			str = "Number of rows cannot be negative";
		}
		else if(rows>0)
		{
			System.out.println("=====Pyramid3=====");
			int rowCount = 1;
			for(int i=rows;i>0;i--)
			{
				for(int j=1;j<i;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=rowCount;k++)
				{
					System.out.print(k+" ");
				}
				System.out.println("");
				rowCount++;
			}
			str = "PASS";
			System.out.println("=====Pyramid3=====");
		}
		
		return str;
	}
	
	public String pyramid4(int rows)
	{
		String str = null;
		if(rows==0)
		{
			str = "Number of rows cannot be zero";
		}
		else if(rows<0)
		{
			str = "Number of rows cannot be negative";
		}
		else if(rows>0)
		{
			System.out.println("=====Pyramid4=====");
			int rowCount = 1;
			for(int i=rows;i>0;i--)
			{
				for(int j=1;j<i;j++)
				{
					System.out.print("  ");
				}
				for(int k=1;k<=rowCount;k++)
				{
					System.out.print(k+" ");
				}
				for(int l=rowCount-1;l>=1;l--)
				{
					System.out.print(l+" ");
				}
				System.out.println("");
				rowCount++;
			}
			str = "PASS";
			System.out.println("=====Pyramid4=====");
		}
		
		return str;
	}
	
	public String pyramid5(int rows)
	{
		String str = null;
		if(rows==0)
		{
			str = "Number of rows cannot be zero";
		}
		else if(rows<0)
		{
			str = "Number of rows cannot be negative";
		}
		else if(rows>0)
		{
			System.out.println("=====Pyramid5=====");

			for(int i=rows;i>0;i--)
			{
				for(int j=1;j<i;j++)
				{
					System.out.print("  ");
				}
				for(int k=i;k<=rows;k++)
				{
					System.out.print(k+" ");
				}
				for(int l=rows-1;l>=i;l--)
				{
					System.out.print(l+" ");
				}
				System.out.println("");
			}
			str = "PASS";
			System.out.println("=====Pyramid5=====");
		}
		
		return str;
	}
	
	public String pyramid6(int rows)
	{
		String str = null;
		if(rows==0)
		{
			str = "Number of rows cannot be zero";
		}
		else if(rows<0)
		{
			str = "Number of rows cannot be negative";
		}
		else if(rows>0)
		{
			System.out.println("=====Pyramid6=====");
			for(int i=rows;i>0;i--)
			{
				for(int x=i;x<rows;x++)
				{
					System.out.print("  ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print(j+" ");
				}
				for(int k=i-1;k>=1;k--)
				{
					System.out.print(k+" ");
				}
				System.out.println("");
			}
			str = "PASS";
			System.out.println("=====Pyramid6=====");
		}
		
		return str;
	}
	
	public String pyramid7(int rows)
	{
		String str = null;
		if(rows==0)
		{
			str = "Number of rows cannot be zero";
		}
		else if(rows<0)
		{
			str = "Number of rows cannot be negative";
		}
		else if(rows>0)
		{
			System.out.println("=====Pyramid7=====");

			for(int i=rows;i>0;i--)
			{
				for(int j=1;j<i;j++)
				{
					System.out.print("  ");
				}
				for(int k=i;k<=rows;k++)
				{
					System.out.print(k+" ");
				}
				for(int l=rows-1;l>=i;l--)
				{
					System.out.print(l+" ");
				}
				System.out.println("");
			}
			int temp = 1;
			for(int i=rows-1;i>=1;i--)
			{
				for(int j=1;j<=temp;j++)
				{
					System.out.print("  ");
				}
				for(int k=temp+1;k<=rows;k++)
				{
					System.out.print(k+" ");
				}
				for(int l=rows-1;l>temp;l--)
				{
					System.out.print(l+" ");
				}
				System.out.println("");
				temp++;
			}
			str = "PASS";
			System.out.println("=====Pyramid5=====");
		}
		
		return str;
	}
	
}
