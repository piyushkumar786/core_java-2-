//if we variable declare as final keyword then dont need to again assign the variable
class parent
{
public static void main(String args[])
{
final int a=10;//in local we can assing final keyword
a=a+10;//againg reassign
System.out.println(a);
}
}

/*
lib@lib-OptiPlex-3010:~$ javac polymorph5.java
polymorph5.java:6: error: cannot assign a value to final variable a
a=a+10;
^
1 error
*/
