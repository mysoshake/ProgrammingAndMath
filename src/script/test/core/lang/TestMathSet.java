package test.core.lang;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lib.lang.MathSet;
import lib.lang.constant.MathBoolean;

class TestMathSet
{

	@Test
	void test()
	{
		MathSet a = new MathSet("0");
		assertEquals(a.equals(MathSet.VOID), MathBoolean.TRUE);
	}

}
