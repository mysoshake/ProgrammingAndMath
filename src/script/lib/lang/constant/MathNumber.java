package lib.lang.constant;

import lib.lang.MathSet;

public abstract class MathNumber extends MathSet
{
	public static final MathNumber natural;
	public static final MathNumber integer;
	public static final MathNumber ratial;
	public static final MathNumber irratial;
	public static final MathNumber real;
	public static final MathNumber complex;
	public static final MathNumber quarternion;

	static
	{
		natural = new MathNumber(new MathSet("Natural Number"))
		{};
		integer = new MathNumber(new MathSet("Integer Number"))
		{};
		ratial = new MathNumber(new MathSet("Ratial Number"))
		{};
		irratial = new MathNumber(new MathSet("Irratial Number"))
		{};
		real = new MathNumber(new MathSet("Real Number"))
		{};
		complex = new MathNumber(new MathSet("Complex Number"))
		{};
		quarternion = new MathNumber(new MathSet("Quarternion Number"))
		{};
	}

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
