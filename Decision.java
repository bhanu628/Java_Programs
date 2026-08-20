class Decision
{
public static void main(String[]args)
{
int age=18;
if(age>20)
{
System.out.println("eligible");
}
else if(age>44)
{
System.out.println("eligible but not for vote");
}
else if(age>45)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}