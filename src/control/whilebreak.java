package control;

public class whilebreak {
public static void main(String args[])
{
	int i=0;
	while(i<=10)
	{
		System.out.println("\n"+i);
		i++;
		if(i==5)     
		{
			break;
		}
	}
}
}
