//one person have different behaviour
//eg.i am child at home and student at collage and friend in friends.
//types of polymorphism
//1.compile time/static binding/early binding..eg.method overloading
//2.runtime/dynamic/late bindind.....3.method overriding
//many forms

//three type of oveloading in java
//1.method overlaoding
//2.constructor overlaoding
//3.operator overloading


//start overlaoding
//method overlaoing---class contain more than one method with same name and different number argument or same number of argument
//m1(int a)....m1(int a,int b)
//or m1(int a) .... m1(char c)
//download aadhar card...1.using mobile number...2.using aadhar number....3.using name and address(ie.functinality same but input different)
//second example:one address proof....second address proof
class Test
{
void m1(int a)
{
System.out.println("int m1 method");
}
void m1(int a,int b)//same function with differnt number of agrument
{
System.out.println("int,int m1 method");
}
void m1(char c)//same function with same number of argument with different data type
{
System.out.println("int m1 method");
}
public static void main(String args[])
{
Test t=new Test();
t.m1(10);
t.m1(10,20);
t.m1('a');

}
}
//functanality same but differnt logic...above three method is ovrloaded....it decide compile time so static(no change)..early binding
/*
piyush@piyush-ESPRIMO-E5730:~$ java Test
int m1 method
int,int m1 method
int m1 method
*/
