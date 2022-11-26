package lib.lang.constant;

import java.lang.reflect.Type;

import lib.lang.MathObject;

public class MathBoolean extends MathObject
{
	public static final MathBoolean TRUE;
	public static final MathBoolean FALSE;

	private static enum MathBooleanElement
	{
		E_NULL, E_TRUE, E_FALSE;
	}

	static
	{
		TRUE = new MathBoolean(true);
		FALSE = new MathBoolean(false);
	}

	private final MathBooleanElement Value;

	public MathBoolean()
	{
		this(MathBooleanElement.E_NULL);
	}

	public MathBoolean(boolean value)
	{
		this(value ? MathBooleanElement.E_TRUE : MathBooleanElement.E_FALSE);
	}

	public MathBoolean(MathBoolean bool)
	{
		this(bool.Value);
	}

	private MathBoolean(MathBooleanElement bool)
	{
		super("Boolean");
		Value = bool;
	}

	public MathBoolean Negate()
	{
		if (this.Value == MathBooleanElement.E_NULL) return null;

		return Value == MathBooleanElement.E_TRUE ? FALSE : TRUE;
	}

	public MathBoolean Disjunction(MathBoolean bool)
	{
		if (this.Value == MathBooleanElement.E_NULL) return null;

		if (this.Value == MathBooleanElement.E_TRUE) return TRUE;

		if (bool.Value == MathBooleanElement.E_TRUE) return TRUE;

		return FALSE;
	}

	public MathBoolean Conjunction(MathBoolean bool)
	{
		if (this.Value == MathBooleanElement.E_NULL) return null;

		if (this.Value == MathBooleanElement.E_FALSE) return FALSE;

		if (bool.Value == MathBooleanElement.E_FALSE) return FALSE;

		return TRUE;
	}

	public MathBoolean Not()
	{
		return Negate();
	}

	public MathBoolean Or(MathBoolean bool)
	{
		return Disjunction(bool);
	}

	public MathBoolean And(MathBoolean bool)
	{
		return Conjunction(bool);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == null) return false;

		if (this instanceof()) obj = (MathBoolean) obj;



		return false;
	}
}
