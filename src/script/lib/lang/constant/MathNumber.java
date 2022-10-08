package lib.lang.constant;

import lib.lang.MathObject;
import lib.lang.MathSet;

public class MathNumber extends MathSet
{
	public static final MathNumber natural = new MathNumber();
	public static final MathNumber integer = new MathNumber();
	public static final MathNumber ratial = new MathNumber();
	public static final MathNumber irratial = new MathNumber();
	public static final MathNumber real = new MathNumber();
	public static final MathNumber complex = new MathNumber();
	public static final MathNumber quarternion = new MathNumber();

	private final MathSet values;

	public MathNumber()
	{
		values = MathSet.VOID;
	}

	public MathNumber(MathSet set)
	{
		values = set;
	}
}
