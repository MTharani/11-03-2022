package com.doSelect;

public class Overload 
{
	void series(int x, int n)
	{
		int i;
		double s=0;
		for(i=0;i<=n;i++)
		{
			s=s+Math.pow(x, i);
		}
		System.out.println("sum"+s);
	}
	void series(int p)
	{
		for(int i=1;i<=p;i++)
		{
			int term=0;
			term=(i*i*i)-1;
			System.out.print(term+ ",");
			
		}
		System.out.println();
	}
	void series()
	{
		double s=0;
		for(int i=2; i<10;i++) 
		{
		s=s+(1/i);	
		}
		System.out.println("sum"+s);
	}

	public static void main(String[] args) 
	{
		Overload o=new Overload();
		o.series(2, 5);
		o.series(5);
		o.series();

	}

}
