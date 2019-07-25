//the process of hiding the implementation of process called abstrct class
//abstract method:it constain only declaration...and method end with semicolon.....to use abstrct method
//abstrct class(helper class):if class contain at least one abstrct method then it is called abstrct class
//abstrct class use abstrct keyword
//diff bet abstract class and normal class
//in java do not need create object of the abstract class
abstract class test//abstrct class 
{
	abstract void m1();//abstrct method
	abstract void m2();
	abstract void m3();//only declartion,write implentation in the child class
	void m4()//normal methodtestt
	{
		System.out.println("m4 method");
	}
}
class test1
{
	void m1() { System.out.println("method1");}
	void m2() { System.out.println("method2");}
	void m3() { System.out.println("method3");}
	public static void main(String args[])
{
//	test t=new test();...it is not possible becoz it is abstrct class
//so crete object of the child class
test1 t=new test1();
	t.m1();
	t.m2();
	t.m3();

}

}

/*
piyush@piyush-ESPRIMO-E5730:~$ javac polmor1.java
piyush@piyush-ESPRIMO-E5730:~$ java test1
method1
method2
*/
