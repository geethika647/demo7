// search an element in an array
import java.util.Scanner;
class Searchelement
{
public static void main(String args[])
{
int n,x,flag=0,i=0;
Scanner scob=new Scanner(System.in);
System.out.println("Enter the number of elments you want in an array ");
n=scob.nextInt();
int a[]=new int[n];
System.out.println("enter all the elements");
for(i=0;i<n;i++)
{
a[i]=scob.nextInt();
}
//code for searching an element
System.out.println("enter the element that you want to search");
x=scob.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==x)
{
flag=1; 
break;
}
}
if(flag==1)
{
System.out.println("element found at the position:"+(i+1));
}
else
{
System.out.println("element not found");
}
}
}



