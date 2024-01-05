//CALLING DEFAULT CONSTRUCTOR FROM PARAMETERISED CONSTRUCTOR
class A
{
A()
{
System.out.println("hello a from default parameterised constructor");
}
A(int x)
{
this();
System.out.println(x);
}
}
class Thistest4
{
public static void main(String args[])
{
A a=new A(27);
}
}

