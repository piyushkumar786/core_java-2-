//rule 4:if we use final keyword then not possible overridding the method
class parent
{
final merry()//overridden method
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
//overidding is not posible
lib@lib-OptiPlex-3010:~$ javac polymorph4.java
polymorph4.java:4: error: invalid method declaration; return type required
final merry()//overridden method
      ^
1 error
*/
