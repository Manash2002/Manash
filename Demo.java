abstract class A
{
abstract void m1();
abstract void m2();
}
 class B extends A
{
	public void m1()
	{
		System.out.println("hii");
	}
	public void m2()
	{
		System.out.println("bye");
	}
	public static void main(String []args)
	{
		B b1=new B();
		b1.m1();
		b1.m2();
	}
}