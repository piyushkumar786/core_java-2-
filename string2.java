class string1
{
public static void main(String args[])
{
//if object crete then it is not change so it is inmutable
String s1="piyush";
System.out.println(s1);
s1.concat("soft");
System.out.println(s1);
String s2=new String("kumar");
System.out.println(s2);
//it is mutable in nature
StringBuffer s3=new StringBuffer("singh");
System.out.println(s3);
s3.append("piyush");
System.out.println(s3);
}
}

/*

piyush
piyush
kumar
singh
singhpiyush
*/
