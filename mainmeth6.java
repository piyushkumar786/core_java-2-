class parent
{
public static void main(String args[])
{
main(10);
System.out.println("string main method");
}
public static void main(int a)
{
main('p');
System.out.println("int main method");
}
public static void main(char c)
{
System.out.println("char main method");
}
}
/*
//the previous example jvm only called the string main method but we called another method by using the mathod calling
piyush@piyush-ESPRIMO-E5730:~$ javac mainmeth6.java
piyush@piyush-ESPRIMO-E5730:~$ java parent
char main method
int main method
string main method
*/
