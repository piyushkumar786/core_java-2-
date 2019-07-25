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
//above program look like method overrideding becoz same function name but it is not method overridding becoz static keyword use ,so if static use then no overridding possible
piyush@piyush-ESPRIMO-E5730:~$ javac mainmeth2.java
piyush@piyush-ESPRIMO-E5730:~$ java parent
parent
piyush@piyush-ESPRIMO-E5730:~$ java child
child
piyush@piyush-ESPRIMO-E5730:~$ 

*/
