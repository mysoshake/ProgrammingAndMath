package lib.lang.constant;

import lib.lang.MathObject;

public class MathBoolean extends MathObject
{
	public static final MathBoolean TRUE = new MathBoolean();
	public static final MathBoolean FALSE = new MathBoolean();

	private final MathBoolean Value;

	public MathBoolean()
	{
		Value = null;
	}

	public MathBoolean(boolean value)
	{
		Value = value ? TRUE : FALSE;
	}

	public MathBoolean(MathBoolean bool)
	{
		Value = bool;
	}

	public MathBoolean Not()
	{
		if(this.Value == null) return null;

		return Value == TRUE ? FALSE : TRUE;
	}

	public MathBoolean And(MathBoolean bool)
	{
		if(this.Value == null) return null;

		if (this.Value == TRUE && bool.Value == TRUE) return TRUE;
		return FALSE;
	}

	public MathBoolean Or(MathBoolean bool)
	{
		if(this.Value == null) return null;

		if (this.Value == FALSE && bool.Value == FALSE) return FALSE;
		return TRUE;
	}

}
