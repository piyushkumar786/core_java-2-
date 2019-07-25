//public:var,method,class--any pacakge access..any use
//protected:var,method--within package and outside child class possible
//private:var,method---only within class
//default:var,method,class----not neccery to write----within package

case1:both are default modifier then same level access
class parent
{
 void m1()
{
System.out.println("method1() of parent");
}
}
class child extends parent
{
void m1()
{
System.out.println("method1() of the child");
}
}

//
case2:proted can access same class and outside with child class ....public can access anywhere so,level is increase
class parent
{
protected void m1()
{
System.out.println("method1() of parent");
}
}
class child extends parent
{
public m1()
{
System.out.println("method1() of the child");
}
}



//case3:public class anyone access but default access in the same class so it has less permission level
class parent
{
 public void m1()
{
System.out.println("method1() of parent");
}
}
class child extends parent
{
void m1()
{
System.out.println("method1() of the child");
}
}

