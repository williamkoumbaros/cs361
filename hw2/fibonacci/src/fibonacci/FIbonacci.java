package fibonacci;

public class FIbonacci {
	public static long sequence[]=new long[92];
	public static int last =1;
	public static long fibonacci(int n ) throws  IllegalArgumentException 
	{
		if (n < 0)
		{
			throw  new IllegalArgumentException("cannot accept number <0 ");
		}
		if(n>91)
		{
			throw new IllegalArgumentException("fibonacci numbers larger than 91 will overflow");
		}
		if (n==0||n==1)
		{
			return 1;
		}
		else
			{
			return(fibonacci(n-1)+fibonacci(n-2));
				
			}
		
	}
	public static long ifibonacci(int n)
	{
		if (n < 0)
		{
			throw  new IllegalArgumentException("cannot accept number <0 ");
		}
		if(n>91)
		{
			throw new IllegalArgumentException("fibonacci numbers larger than 91 will overflow");
		}
		long a=1;
		long b=1;
		long temp;
		if (n<2)
		{
			return 1;
		}
		else 
		{
			for (int i=2; i <= n; i++)
			{
				temp = a+b;
				a = b;
				b = temp;
			}
			return b;
		}
	}
	public static long afibonacci(int n)
	{
		if (n < 0)
		{
			throw  new IllegalArgumentException("cannot accept number <0 ");
		}
		if(n>91)
		{
			throw new IllegalArgumentException("fibonacci numbers larger than 91 will overflow");
		}
		if (n <= last)
		{
			return sequence[n];
		}
		else 
		{
			for (int i = last+1; i <= n; i++)
			{
				sequence[i]=sequence[i-1]+sequence[i-2];
			}
			return sequence[n];
		}
	}
	
	public static void main(String[] args)
	{
		sequence[0]=1;
		sequence[1]=1;
		for(int i =0 ;i < 100;i++)
		{
			System.out.print(i);
			System.out.print(":");
			System.out.println(afibonacci(i));
			
		}
	}
	

}
