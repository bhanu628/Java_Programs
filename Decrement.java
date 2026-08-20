class Decrement
{
public static void main(String[]args)
{
int i=30;
int j=i++;
int k=i++ + j++ + i-- + j++ + ++i + j-- + --i + --j + i++ + j--;
System.out.println(i);
System.out.println(j);
System.out.println(k);
}
}