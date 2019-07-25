//method overridding
//rule1:parent and child signature are same
class parent
{
void merry()//overridden method
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
//same method name with same argument knowns as method overridding....it call then execute child class method becoz call only child class
lib@lib-OptiPlex-3010:~$ javac polymorph1.java
lib@lib-OptiPlex-3010:~$ java child
red girl
*/
