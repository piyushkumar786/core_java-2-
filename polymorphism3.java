//operator overloading--one opeartor have more than one behavior
//cpp support overloading concept
//java not support operator overloading only plus opeartor ovrerloading
class Test
{
public static void main(String args[])
{
//opeartor overloading
System.out.println(10+20);
System.out.println("piyush"+"kumar");
System.out.println("piyush"+10);
System.out.println(10+"kumar");
System.out.println(10+"piyush"+"kumar"+10+20);
}
}

/*
//plus operator use for addition and concatitation of string
piyush@piyush-ESPRIMO-E5730:~$ javac polymorphism3.java
piyush@piyush-ESPRIMO-E5730:~$ java Test
30
piyushkumar
piyush10
10kumar
10piyushkumar1020//10 and piyush =10piyush(string)..10piyush+kumar=10piyushkumar(string)...10piyushkumar+10=10piyushkumar10(string)...10piyushkumar10+20=10piyushkumar1020(string)


*/
