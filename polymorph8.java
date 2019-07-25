class parent
{
void m1()
{
System.out.println("method1() of parent");
}
}
class child extends parent
{
void m1()
{
System.out.println("method1() of the child");
}
void m2()
{
System.out.println("method2() of the child");
}
public static void main(String args[])
{
parent p=new child();
p.m1();

}
}
/*
//compile time parent check but the runtime child method check so output is child class method	
lib@lib-OptiPlex-3010:~$ javac polymorph8.java
lib@lib-OptiPlex-3010:~$ java child
method1() of the child

*/
