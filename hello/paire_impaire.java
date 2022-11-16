package hello;

import java.util.Scanner;

public class paire_impaire {

	public static void main(String[] args)
	{
		String rep="yes";
		Scanner s = new Scanner(System.in);
		while((rep.equals("yes"))||(rep.equals("oui")))
		{
			System.out.println("saisir un nombre entier");
			
			int nb = s.nextInt();
			boolean b =(nb%2==0);
			if(b) 
				{
					System.out.println(nb + " est un nombre paire");
				}
			else 
				{
					System.out.println(nb + " est un nombre impaire");
				}
			System.out.println("voulez vous continuez ?");
			rep = s.next();
		}
		s.close();
	}
}
