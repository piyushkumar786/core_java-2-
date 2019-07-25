class parent
{
static void m1()
{
System.out.println("method1() of parent");
}
}
class child extends parent
{
static void m1()
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
//twisting in the output beacuse static depend on the class not object so,at compile time check parent class and print it.it is not possible overidding becuase static binding class.it also called (method hidding)

lib@lib-OptiPlex-3010:~$ javac polymorph11.java
lib@lib-OptiPlex-3010:~$ java child
method1() of parent
*/
