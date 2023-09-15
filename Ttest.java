class A{

}
class B extends A{

}
class C extends B{

}
class Ttest{
    public void m1(Object o){
        System.out.println("one");

    }
    public void m1(A a){
        System.out.println("two");

    }
    public void m1(String s){
         System.out.println("three");

    }
    public static void main(String[] args){
        C c = new C();
        Ttest t= new Ttest();
        t.m1(null);

    }
}