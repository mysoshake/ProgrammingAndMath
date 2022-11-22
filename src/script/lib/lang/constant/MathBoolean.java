package lib.lang.constant;

import lib.lang.MathObject;

public class MathBoolean extends MathObject
{
	public static final MathBoolean TRUE;
	public static final MathBoolean FALSE;

	private static enum MathBooleanElementary
	{
		E_NULL, E_TRUE, E_FALSE;
	}

	static
	{
		TRUE = new MathBoolean(true);
		FALSE = new MathBoolean(false);
	}

	private final MathBooleanElementary Value;

	public MathBoolean()
	{
		Value = MathBooleanElementary.E_NULL;
	}

	public MathBoolean(boolean value)
	{
		Value = value ? MathBooleanElementary.E_TRUE : MathBooleanElementary.E_FALSE;
	}

	public MathBoolean(MathBoolean bool)
	{
		Value = bool.Value;
	}

	public MathBoolean Not()
	{
		if (this.Value == MathBooleanElementary.E_NULL) return null;

		return Value == MathBooleanElementary.E_TRUE ? FALSE : TRUE;
	}

	public MathBoolean And(MathBoolean bool)
	{
		if (this.Value == MathBooleanElementary.E_NULL) return null;

		if (this.Value == MathBooleanElementary.E_FALSE) return FALSE;

		if (bool.Value == MathBooleanElementary.E_FALSE) return FALSE;

		return TRUE;
	}

	public MathBoolean Or(MathBoolean bool)
	{
		if (this.Value == MathBooleanElementary.E_NULL) return null;

		if (this.Value == MathBooleanElementary.E_TRUE) return TRUE;

		if (bool.Value == MathBooleanElementary.E_TRUE) return TRUE;

		return FALSE;
	}

}
