package lib.lang;

import java.util.List;

import lib.lang.constant.MathBoolean;

public class MathSet extends MathObject
{
	public static final MathSet VOID = new MathSet();

	private final String name;
	private final List<MathObject> elements;

	public MathSet()
	{
		name = null;
		this.elements = List.of();
	}

	public MathSet(String name, MathObject... elements)
	{
		this.name = name;
		this.elements = List.of(elements);
	}

	@Override
	public MathBoolean equals(MathObject mobj)
	{
		return super.equals(mobj);
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder(1024);
		sb.append(super.toString());
		for (int ie = 0; ie < elements.size(); ie++)
		{
			sb.append(elements.get(ie));
		}
		return sb.toString();
	}
}
