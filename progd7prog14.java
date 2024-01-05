//THIS KEYWORD
class Student
{
int rollno;
String name;
float fees;
Student(int rollno,String name,float fees)
{
this.rollno=rollno;
this.name=name;
this.fees=fees;
}
void display()
{
System.out.println(rollno+" "+name+" "+fees);
}
}
class Testthis
{
public static void main(String args[])
{
Student s1=new Student(222,"karan",8000f);
Student s2=new Student(333,"aryan",9000f);
s1.display();
s2.display();
}
}

 