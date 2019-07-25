class piyush1
{
public static void main(String args[])
{
System.out.println(args.length);//it is find the length of the array not string 
System.out.println(args[0]);
System.out.println(args[1]);
System.out.println(args[0]+args[1]);
}
}

/*
//we take argument from command line...we print the length of the args arr...then first and second element ....at last this is string arg so,no addition perform,the concatationa perform of the string
piyush@piyush-ESPRIMO-E5730:~$ javac mainmeth7.java
piyush@piyush-ESPRIMO-E5730:~$ java piyush1 1 2 3 4
4
1
2
12
*/
