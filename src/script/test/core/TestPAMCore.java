package test.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import core.PAMCore;

class TestPAMCore
{

	@Test
	void test()
	{
		assertTrue(new PAMCore().Launch());
	}

}
