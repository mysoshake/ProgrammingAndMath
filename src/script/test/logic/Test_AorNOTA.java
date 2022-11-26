package testuser.elementarylogics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lib.lang.logic.MathProposition;

class Test_AorNOTA
{

	@Test
	@DisplayName("A∨￢A = T")
	void test1()
	{
		MathProposition A;

		A = MathProposition.T;
		assertEquals(MathProposition.T, A.Or(A.Not()));

		A = MathProposition.F;
		assertEquals(MathProposition.T, A.Or(A.Not()));
	}

	@Test
	@DisplayName("A⋀￢A = F")
	void test2()
	{
		MathProposition A;

		A = MathProposition.T;
		assertEquals(MathProposition.F, A.And(A.Not()));

		A = MathProposition.F;
		assertEquals(MathProposition.F, A.And(A.Not()));
	}

	@Test
	@DisplayName("A∨T = T")
	void test3()
	{
		MathProposition A;

		A = MathProposition.T;
		assertEquals(MathProposition.T, A.Or(MathProposition.T));

		A = MathProposition.F;
		assertEquals(MathProposition.T, A.Or(MathProposition.T));
	}

	@Test
	@DisplayName("A⋀T = F")
	void test4()
	{
		MathProposition A;

		A = MathProposition.T;
		assertEquals(MathProposition.F, A.And(MathProposition.F));

		A = MathProposition.F;
		assertEquals(MathProposition.F, A.And(MathProposition.F));
	}

}
