class string4
{

int eid;
String ename;
string4(int eid,String ename)
{
this.eid=eid;
this.ename=ename;
}
public String toString()
{
return "emp id="+eid+"emp name="+ename;
}
public static void main(String args[])
{
string4 s1=new string4(12,"piyush");
System.out.println(s1);
System.out.println(s1.toString());
}

}

/*
//the toString() print same result but class find tostring method then print result else it print the object tostring method. 
piyush@piyush-ESPRIMO-E5730:~$ javac string4.java
piyush@piyush-ESPRIMO-E5730:~$ java string4
emp id=12emp name=piyush
emp id=12emp name=piyush
*/
