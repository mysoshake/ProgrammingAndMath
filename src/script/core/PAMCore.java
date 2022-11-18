package core;

import static org.junit.jupiter.api.Assertions.fail;

public class PAMCore
{
	public static void main(String[] args)
	{
		new PAMCore();
	}

	public PAMCore()
	{
		System.out.println("Setup");
		new Controller();
		System.out.println("Setup Finish");

		// Setup finished correctly
		if (Setup() == true)
		{
			Launch();
		}
	}

	public boolean Setup()
	{
		try
		{
			// TODO Call Launcher
			fail("Not Implemented");
		}
		catch (Exception e)
		{
			// TODO Error handle
			System.err.println("Error");
			return false;
		}

		return true;
	}

	public boolean Launch()
	{

		new Controller();

		//Correct Finish
		return true;
	}
}
