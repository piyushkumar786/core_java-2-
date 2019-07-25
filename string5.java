class string5
{
public static void main(String args[])
{
//if object crete then it is not change so it is inmutable
String s1="piyush";
String s4="piyush";
System.out.println(s4);

s1.concat("soft");
System.out.println(s1.equals(s4));
System.out.println(s1);
String s2=new String("kumar");
System.out.println(s2);

//it is mutable in nature
StringBuffer s3=new StringBuffer("singh");
System.out.println(s3);
StringBuffer s5=new StringBuffer("singh");
System.out.println(s5.reverse());//reverse of the string
System.out.println(s3.equals(s5));
s3.append("piyush");
System.out.println(s3);
}
}

/*

//string equals method
piyush@piyush-ESPRIMO-E5730:~$ javac string5.java
^[[Apiyush@piyush-ESPRIMO-E5730:~$ java string5
piyush
true
piyush
kumar
singh
hgnis//revese of the string
false
singhpiyush
*/
