package lib.lang.logic;

import java.util.Map;

import lib.lang.MathObject;
import lib.lang.MathSet;

// 公理
public class MathAxiom extends MathObject
{
	public static final MathAxiom PEANO_AXIOM = new MathAxiom();

	private final MathSet target;

	static
	{

	}

	public MathAxiom()
	{
		this.target = MathSet.VOID;
	}

	public MathAxiom(MathSet target)
	{
		this.target = target;
	}


}
