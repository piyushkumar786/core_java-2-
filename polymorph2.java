//return type of the overridden and overridding method must be same
class parent
{
int merry()//overridden method
{
System.out.println("black girl");
}
}
class child extends parent
{
void merry()//overridding method
{
	System.out.println("red girl");
}
public static void main(String args[])
{
	new child().merry();
}
}
/*
//return type must be same of the two method
lib@lib-OptiPlex-3010:~$ javac polymorph2.java
polymorph2.java:7: error: missing return statement
}
^
polymorph2.java:11: error: merry() in child cannot override merry() in parent
void merry()//overridding method
     ^
  return type void is not compatible with int
*/
