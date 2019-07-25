//rule 6:use of final keyword
class student {
	fuction();
}
final class parent//if final class then it is not extendable
{
student s;
	s.function();
int a=10;//it class is final then not consider variable as fianl 
void m1()//method is final because class is not extendible so not overriding possible
{
a=a+100;
System.out.println(a);
}
public static void main(String args[]) {
	
	
new parent().m1();
}
}


/*
	core java
		oop concepts 
		inheritance 
		polymorphism
		composition
		abstraction
		exception handling
	advanced
		Collection framework
			|
	|	|	|    | 		 |
	set 	list queue  stack  	Map
	HashSet ArrayList Deque 	HashMap
	LinkedHashSet 			LinkedHashMap
	TreeSet				TreeMap

	Database
		Sql OR sqlite
	Network programming
		UDP 
		TCP
	OPTIONS 
	1) android 
	
	2) web applications
		servlet 
		jsp
	3) stand alone 	
		AWT 
		SWING
		JAVAFX		
/*
lib@lib-OptiPlex-3010:~$ javac polymorph6.java
lib@lib-OptiPlex-3010:~$ java parent
110
*/

