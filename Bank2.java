class Bank2
{
public static void main(String[]args)
{
int cash=3900;
int withdraw=400;
if(cash<withdraw)
System.out.println("the withdraw money is");
else if(withdraw%100!=0)
System.out.println("the 100 is multiple");
else if(withdraw<4000)
System.out.println("withdraw is 4000");
else
System.out.println("success");
}
}