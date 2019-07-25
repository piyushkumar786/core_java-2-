//strictfp modifier aplicable for class and method
//eg: 10/3=3.3  it called calculation float value
//resultdepend on o.s platform but java flatform independ...(strict floating point)
//synchronized modifier use only method
//if method deaclere sychronized then only one thread access..that is light weight process
//if main method declare syncronized ,only one thred access main method
class parent 
{
public static void main(String args[])
{
System.out.println("parent");
}
}
class child extends parent
{
public static void main(String args[])
{
System.out.println("child");
}
}

/*
//we can declare more than one main method,but in one class only one method,when compiled and load then it find the main method for the execution
piyush@piyush-ESPRIMO-E5730:~$ javac mainmeth2.java
piyush@piyush-ESPRIMO-E5730:~$ java parent
parent
piyush@piyush-ESPRIMO-E5730:~$ java child
child
piyush@piyush-ESPRIMO-E5730:~$ 

*/
