abstract class test
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
}
abstract class test1 extends test
{
	void m1() {System.out.println("m1 method");   }
} 

abstract class test2 extends test1
{
	void m2() {System.out.println("m2 method");   }
} 

class test3 extends test2
{
	void m3() {System.out.println("m3 method");   }
public static void main(String args[])
{
test3 t=new test3();
t.m1();
t.m2();
t.m3();
}
} 

/*
//if three function is abstrct ,then we can define method diffrent class
piyush@piyush-ESPRIMO-E5730:~$ javac polmor2.java
piyush@piyush-ESPRIMO-E5730:~$ java test3
m1 method
m2 method
m3 method
*/
