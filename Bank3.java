class Bank3
{
public static void main(String[]args)
{
int amount=30000;
int balance=10000;
if(amount<balance)
System.out.println("the amount is withdraw");
else if(balance%100!=0)
System.out.println("the 100 is multiple");
else if(balance<3000)
System.out.println("the 3000 is not");
else
System.out.println("success");
}
}