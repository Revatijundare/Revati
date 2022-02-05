package control;

public class Dowhile 
{
public static void main(String arg[])
{
	int i=1;
	int sum=0;
	do
	{
		sum=sum+i;
		i++;
	}while(i<=10);
		System.out.println("The sum of 1 to 10 is " +sum);
}
}
