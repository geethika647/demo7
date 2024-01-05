//calculate the simple intrest
import java.util.Scanner;
class SI
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int P=sc.nextInt();
double r=sc.nextDouble();
double t=sc.nextDouble();
double si=P*r*t;
System.out.println(si);
}
}
