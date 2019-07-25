abstract class test
{
test()
{
System.out.println("test constructor");
}
{
System.out.println("instance block");
}
static 
{
System.out.println("static block");
}
}
class test1 extends test
{
test1()
{
super();
System.out.println("test1 construtor");
}
public static void main(String args[])
{
new test1();
}
}
/*
//only static execute once,instace block depend on obj
piyush@piyush-ESPRIMO-E5730:~$ javac polmor5.java
piyush@piyush-ESPRIMO-E5730:~$ java test1
static block
instance block
test constructor
test1 construtor

*/
