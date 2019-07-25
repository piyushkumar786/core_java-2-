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
p.m2();//but not direct method possible

}
}

/*
//it generete error because at compile parent method check but not parent method present so error generetaed.if method present then at the complie time print child class method	
lib@lib-OptiPlex-3010:~$ javac polymorph9.java
polymorph9.java:22: error: cannot find symbol
p.m2();
 ^
  symbol:   method m2()
  location: variable p of type parent
1 error

*/
