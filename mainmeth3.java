class parent 
{
public static void main(String args[])
{
System.out.println("parent");
}
}
class child extends parent
{

}

/*
//in the program child method not contain main method but it is child class and inherit parent class using inheritance phenomenon,so output is parent ie access the main mathod functionality
piyush@piyush-ESPRIMO-E5730:~$ javac mainmeth3.java
piyush@piyush-ESPRIMO-E5730:~$ java parent
parent
piyush@piyush-ESPRIMO-E5730:~$ java child
parent
piyush@piyush-ESPRIMO-E5730:~$ 
*/
