package testuser.elementarylogics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lib.lang.constant.MathBoolean;
import lib.lang.logic.MathProposition;

class Test_AorNOTA
{

	@Test
	@DisplayName("A∨￢A = T")
	void test()
	{
		MathProposition A = MathProposition.T;

		assertEquals(MathProposition.T, A.Or);
	}

}
