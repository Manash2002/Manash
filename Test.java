class Test 
{
	public static void main(String[] args) 
	{
		A a1=new A();
		a1.m1();
		B b1=new B();
		b1.m1();
		C c1=new C();
		c1.m1();
		A a2=new B();
		a2.m1();
		A a3=new C();
		a3.m1();
		B b2=new C();
		b2.m1();
		
	}
}
class A
{
	public void m1()
	{
		System.out.println("hii");
	}
}
class B extends A
{
	public void m1()
	{
		System.out.println("byee");
	}
}
class C extends B
{
	public void m1()
	{
		System.out.println("ok");
	}
}