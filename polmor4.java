//constructor and class name same
//inside abstract class declare of constructor allowed or not
//ans-inside abstrct class constructor possible
//in we study abstrct related var,method,constructor,instance method,static method
abstract class test
{
test()
{
System.out.println("abstract class constructor");
}
abstract void m1();
}
class test1 extends test
{
void m1()
{
System.out.println("m1 method");
}
test1()
{
super();
System.out.println("test 1 constructor");
}
public static void main(String args[])
{
new test1().m1();
}
}
/*
//it is possible declare and execute construtor
piyush@piyush-ESPRIMO-E5730:~$ javac polmor4.java
piyush@piyush-ESPRIMO-E5730:~$ java test1
abstract class constructor
test 1 constructor
m1 method
*/
