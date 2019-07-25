class parent
{}
class child extends parent
{}
parent p=new parent();//valid
child c=new child();//valid
parent p=new child();//valid ...it hold the child class
child c=new parent();//it is not hold the child class

