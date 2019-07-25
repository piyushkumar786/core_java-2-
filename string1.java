//string operation.there are four class
//1.String
//2.StringBuffer
//3.StringBuilder
//4.StringTockenizer

//group of character

//differ bet String and String Buffer
//case-1.both are final class present in java lang package
//case-2:  String s1="ratan"
//         String s2=new String("ratan")
//         StringBuffered s3=new StringBuffered("ratan");

class string1
{
public static void main(String args[])
{
String s1="piyush";
System.out.println(s1);
String s2=new String("kumar");
System.out.println(s2);
StringBuffer s3=new StringBuffer("singh");
System.out.println(s3);
}
}
/*
//three way declare string
piyush@piyush-ESPRIMO-E5730:~$ javac string1.java
piyush@piyush-ESPRIMO-E5730:~$ java string1
piyush
kumar
singh
*/


