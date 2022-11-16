package hello;
import java.util.Scanner;

public class compte_a_rebours 
{
	public static void main(String[]args) 
	{
	Scanner s = new Scanner(System.in);
	int j = s.nextInt();
	s.close();
	for(int i = j;i>(-1);i--)
	{
		if(i>0)
		{	
			System.out.print(i + " ");
		}
		else
		{
			System.out.print(i);
		}
	}
	}
}
