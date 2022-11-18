package test.core;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import core.PAMCore;

class TestPAMCore
{

	@Test
	void test()
	{
		PAMCore tested = new PAMCore();
		boolean wasLaunched = tested.Launch();
		assertTrue(wasLaunched);
	}

}
