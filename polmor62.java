package com.dss.client;
import com.dss.declarations.message;
public class testclient1 implements message
{
public void morn()
{
System.out.println("good morning");
}
public void gn()
{
System.out.println("good night");
}
public void even()
{
System.out.println("good evening");
}
public static void main(String args[])
{
testclient1 t=new testclient1();
t.morn();
t.even();
t.gn();
}
}
