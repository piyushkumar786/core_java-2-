//constructor overloadind:same constructor name with differnt number of argument or same number of argument but different datatype
class Test
{
Test(int a)
{
System.out.println("int arg cons");
}
Test(int a,int b)//same constructor name with different arg
{
System.out.println("int,int arg");
}
Test(char c)//same constructor name with differnt datatype
{
System.out.println("char arg");
}
public static void main(String args[])
{
new Test(10);
new Test(10,20);
new Test('p');
}
}
/*
//it is same as function overloading
piyush@piyush-ESPRIMO-E5730:~$ javac polymorphism2.java
piyush@piyush-ESPRIMO-E5730:~$ java Test
int arg cons
int,int arg
char arg
*/
