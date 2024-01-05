//sorting the element
import java.util.Scanner;
class Sortingelement
{
public static void main(String args[])
{
int n,i=0;
Scanner scob=new Scanner(System.in);
System.out.println("enter the number of elements");
n=scob.nextInt();
int a[]=new int[n];
System.out.println("enter all the elements");
for(i=0;i<n;i++)
{
a[i]=scob.nextInt();
}
//code for sorting
for(i=0;i<a.length;i++)
{
for( int j=i+1;j<a.length;j++)
{
int temp=0;
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for( int x : a)
{
System.out.print(x+"   ");
}
}
}

