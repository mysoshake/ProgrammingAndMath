package testuser.peano;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.abort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lib.lang.logic.MathAxiom;

class TestPeano
{

	@Test
	@DisplayName("ペアのの公理")
	void test()
	{
		MathAxiom peano = MathAxiom.PEANO_AXIOM;
		fail("Fix Later");
	}

}
