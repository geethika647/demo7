//calculating the sum and average
class Sumandaverage
{
public static void main(String args[])
{
int[]numbers={12,8,9,4,-3,-8};
int sum=0;
double average;
for(int a:numbers)
{
sum +=a;
}
 int arrayLength=numbers.length;
average=((double)sum/(double)arrayLength);
System.out.println("Sum:"+sum);
System.out.println("Average:"+average);
}
}
