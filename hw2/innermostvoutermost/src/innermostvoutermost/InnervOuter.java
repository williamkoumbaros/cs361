package innermostvoutermost;

public class InnervOuter {
	public static int eval(int n, int m)
	{
		if (n==0)
		{
			return 0;
		}
		else
		{
			return eval(n-1,eval(n,m));
		}
	}
	

	public static void main(String[] args)
	{
		System.out.println(eval(1,1));
	}
}
