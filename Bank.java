class Bank
{
public static void main(String[]args)
{
int balance=1000;
int withdraw=4000;
if(balance<withdraw)
System.out.println("insuffient balance");
else if(withdraw%100!=0)
System.out.println("multiple by 100");
else if(withdraw>3000)
System.out.println("cant withdraw the 3000");
else
System.out.println("success");
}
}