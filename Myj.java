import java.util.*;
class A
{
	public void m1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n prime no.: ");
		int n=sc.nextInt();
		for (int i=0;i<=n;i++)
		{
			if (i%2==0 & i%3==0 && i%5==0)
				System.out.println(i);
		}
	}
}

class Myj
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		B b=new B();
		b.m1();
		b.m2();
	}
}
