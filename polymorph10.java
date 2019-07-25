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
p.m1();//overriding method possible
//p.m2();//but not direct method possible so use type cast..
child c=(child)p;
c.m2();

}
}

/*

//the drawsbacks remove the type casting .....call by the child method easily
lib@lib-OptiPlex-3010:~$ javac polymorph10.java
lib@lib-OptiPlex-3010:~$ java child
method1() of the child
method2() of the child
*/
