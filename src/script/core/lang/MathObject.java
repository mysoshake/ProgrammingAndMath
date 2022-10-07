package core.lang;

import core.lang.constance.MathBoolean;

// 数学的な対象すべての型
public class MathObject
{

	private final String name;

	public MathObject()
	{
		this("");
	}

	public MathObject(final String name)
	{
		this.name = name;
	}

	// TODO その他基本的メソッド

	public MathBoolean equals(MathObject mobj)
	{
		return MathBoolean.TRUE;
	}

	public String name()
	{
		return this.name;
	}

	public String toString()
	{
		return "[" + this.name + "]" + "@" + this.hashCode();
	}

}
