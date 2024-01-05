//THIS:TO INVOKE CURRENT CLASS METHOD
class G
{
void m()
{
System.out.println("hello m");
}
void n()
{
System.out.println("hello n");
this.m();
}
}
class Testthis3
{
public static void main(String args[])
{
G g=new G();
g.n();
}
}