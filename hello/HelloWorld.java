package hello;

import java.util.Scanner;

public class HelloWorld
{
	public static void main(String[] args)
	{
		String saluer;
		System.out.println("saisir");
		Scanner s = new Scanner(System.in);
		saluer = s.nextLine();
		s.close();
		if((saluer.equals("salue"))||(saluer.equals("cc")))
		{
			for(int v1=2;v1>0;v1--) 
			{
				System.out.println(saluer);		
			}
		}
		switch(saluer)
		{
		case "bonjour" : for(int v1=2;v1>0;v1--) 
			{
				System.out.println(saluer);		
			}; break ;
		case "hello" :for(int v1=2;v1>0;v1--) 
			{
				System.out.println(saluer);		
			}; break ; 
		}
	}
}

