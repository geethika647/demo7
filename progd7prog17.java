//CALLING PARAMETERIZED CONSTRUCTOR FROM DEFAULT CONSTRUCTOR
class A
{
A()
{
this(27);
System.out.print("hello a");
}
A(int x)
{
System.out.println(x);
}
}
class Thistest5
{
public static void main(String args[])
{
A a=new A();
}
}

