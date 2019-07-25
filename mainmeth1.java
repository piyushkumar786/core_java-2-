//public give the permission to the jvm
//direct permission by static,if not static then instance method so static dont need of obj
//void mean no return type in the main function
//main() is already configured in the jvm
//jvm called main() method
//String args[]---command line argument --at runtime...all command store in String in String array format
//why declare String declare...becoz it hold all type of the data
//[]--array present any number pass arg
//args ---variable of string array type
//it is fix sysntax or modification allowed?
//sequence not imporatant
//1.we can declare static public also on the place public static
//2.String [] args...String []args...String args[] it also valid
//3.String[]->String ...(it is also possible)
//args->a,piyush(also possible)
//five modifier use in main() method..public,static,final,synchrongation,strictfp..out of only two modifier mandory remaining is optional

// static public void main(String args[])
//public static void main(String[] args)
//public static void main(String []args)
//public static void main(String args[])
//public static void main(String ...)
//public static void main(String... piyush)
//public static void main(String piyush[])
//static public strictfp void main(String... args)...valid
//static public synchronization void main(String... args)...valid
// static public final void main(String... args)...valid
// static public final strictfp sychronization void main(String... args)...valid

//return type should be void
//public,static must be write becoz it is mandory
class piyush
{
public static strictfp synchronized final void main(String piyush[])
{
System.out.println("piyush kumar");
}
}
/*
piyush@piyush-ESPRIMO-E5730:~$ javac mainmeth1.java
piyush@piyush-ESPRIMO-E5730:~$ java piyush
piyush kumar
*/
