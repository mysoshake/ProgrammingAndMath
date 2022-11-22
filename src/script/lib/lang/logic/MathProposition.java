package lib.lang.logic;

import java.util.function.Function;

import lib.lang.MathObject;
import lib.lang.constant.MathBoolean;

// 命題
public class MathProposition
{

	public static final MathProposition T = new MathProposition((x) -> MathBoolean.TRUE);

	public static final MathProposition F = new MathProposition((x) -> MathBoolean.FALSE);

	private final Function<MathObject, MathBoolean> result;

	public MathProposition()
	{
		result = (x) -> MathBoolean.FALSE;
	}

	public MathProposition(Function<MathObject, MathBoolean> eval)
	{
		result = eval;
	}

	public MathProposition Negate()
	{
		MathProposition ret = new MathProposition((x) -> this.Evaluate(x).Not());

		return ret;
	}

	public MathProposition Or(MathProposition p)
	{
		MathProposition ret = new MathProposition((x) -> this.Evaluate(x).Or(p.Evaluate(x)));

		return ret;
	}

	public MathProposition And(MathProposition p)
	{
		MathProposition ret = new MathProposition((x) -> p.Evaluate(x).Not());

		return ret;
	}

	public MathBoolean Evaluate(MathObject x)
	{
		return result.apply(x);
	}
}
