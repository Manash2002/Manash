class Test1
{
	
}
class Test2 extends Test1
{

}
class Test3 extends Test2
{

}
class A
{
	public void m1(Object o)
	{
		System.out.println("one");
	}
	public void m2(Test1 t1)
	{
		System.out.println("two");
	}
	public void m3(Test2 t2)
	{
		System.out.println("three");
	}
public static void main(String []args)
{
	Test3 t=new Test3();
	A a=new A();
	a.m1(t);
	a.m1(null);
	a.m2(t);
	a.m3(t);
}
}