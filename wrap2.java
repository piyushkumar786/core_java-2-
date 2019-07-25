class test
{
public static void main(String args[])
{
Test t=new Test();
System.out.println(t);
System.out.println(t.toString());//both are same

Integer i=new Integer(200);
System.out.println(i);
System.out.println(i.toString());
}
}

/*
//basically in test class no to.string method() so called parent class nothing but Object class in object class return class-name@hostname
piyush@piyush-ESPRIMO-E5730:~$ javac wrap2.java
piyush@piyush-ESPRIMO-E5730:~$ java test
Test@15db9742
Test@15db9742
200
200

*/

/*
class Object
{
public String toString()
{
return "class-name@host";
}
}
class Integer extends Object
{
public String toString()
{
return "content of the Integer object";
}

}

*/
