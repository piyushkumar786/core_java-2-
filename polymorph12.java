//private modifier use permission
//it acess only own variable,method,access within class
class parent
{
private void m1()
{
System.out.println("method1() of parent");
}
}
class child extends parent
{
private void m1()
{
System.out.println("method1() of the child");
}

public static void main(String args[])
{
parent p=new parent();
p.m1();
}
}
/*
//it is not type of method overidding..becoz both class method is private
//it is not possible becoz method is private of parent class it is not accesible from another class
*/
