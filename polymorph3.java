//rule 3:we can change the return type at the class level
class Animal
{}
class Dog extends Animal
{}
class parent
{
Animal merry()
{
System.out.println("parent class method");
return new Animal();//return the object
}
}
class child extends parent
{

Dog merry()
{
System.out.println("child class method");
return new Dog();//return the object
}
public static void main(String args[])
{
new child().merry();
}
}

/*
//return we can also the change,but refernce the object
lib@lib-OptiPlex-3010:~$ javac polymorph3.java
lib@lib-OptiPlex-3010:~$ java child
child class method
*/
