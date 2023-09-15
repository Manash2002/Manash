import java.util.*;
class E
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n=sc.nextInt();
		for (int i=0;i<=n;i++)
		{
			if (i%3==0 && i%5==0)
				System.out.println(i);
		}
	}
}
