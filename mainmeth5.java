class parent
{
public static void main(String args[])
{
System.out.println("string main method");
}
public static void main(int a)
{
System.out.println("int main method");
}
public static void main(char c)
{
System.out.println("char main method");
}
}
/*
//method overloading possible but jvm only call string main method
piyush@piyush-ESPRIMO-E5730:~$ javac mainmeth5.java
piyush@piyush-ESPRIMO-E5730:~$ java parent
string main method
*/
