package test.core.lang;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import core.lang.MathObject;

class TestMathObject
{

	@Test
	void test()
	{
		MathObject mobj1 = new MathObject();
		MathObject mobj2 = new MathObject("ObjectName");

		System.out.println(mobj1);
		System.out.println(mobj2);

		assertEquals(mobj1.name(), "");
		assertEquals(mobj2.name(), "ObjectName");

	}
}
