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
		// TODO SETUP
		System.out.println("Setup Finish");
	}

	public boolean Launch()
	{
		try
		{
			// TODO Call Launch
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
}
