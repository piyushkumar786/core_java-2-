import java.lang.*;//wrapoer class present in the java.lang. package
class wrap//wrapper mean wrap the class on the primitive data type..
//wrapper class in inmutable...i.e not modify data
//object is root class
//1.number class(character and boolean sodun all)
//2.boolean
//3.character
//it contain 4 method
//1.toString();
//2.valueOf();
//3.xxxValue();
//4.parseXXX();
{
public static void main(String args[])
{
Integer i=new Integer(100);//integer
System.out.println(i);
Integer j=new Integer("200");//string
System.out.println(j);
//Integer l=new Integer("one");//it is not possible
//System.out.println(l);
Float f1=new Float(10.5);//double
Float f2=new Float(10.5f);//float
Float f3=new Float("10.5");//String
System.out.println(f1);
System.out.println(f2);
System.out.println(f3);
}
}
/*
data-type      Wrapper class    constructor
byte            Byte		byte,String
short		Short		short,String
int		Integer		int,String
long		Long		Long,String
float		Float		double,float,String
double		Double		double,String
char		Character	char
boolean		Boolean		boolean,String
*/
