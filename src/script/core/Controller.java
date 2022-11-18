package core;

import java.util.Scanner;

public class Controller
{
	public Controller()
	{
		System.out.println("Controoller");

		Out("Hello\n");

		String input = In("input yourName>");

		Out("Your input is " + input + "\n");
		System.out.println("Controler Fin");
	}

	public static void Out(Object obj)
	{
		System.out.print(obj);
	}

	public static String In(String prompt)
	{
		Out(prompt);

		String ret = "";
		try (Scanner scan = new Scanner(System.in))
		{
			ret = scan.nextLine();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return ret;
	}
}
