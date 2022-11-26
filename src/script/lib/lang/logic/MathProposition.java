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

	public MathProposition Negation()
	{
		return new MathProposition((x) -> this.Evaluate(x).Negate());
	}

	public MathProposition Disjunction(MathProposition p)
	{
		return new MathProposition((x) -> this.Evaluate(x).Disjunction(p.Evaluate(x)));
	}

	public MathProposition Conjunction(MathProposition p)
	{
		return new MathProposition((x) -> this.Evaluate(x).Conjunction(p.Evaluate(x)));
	}

	public MathProposition Not()
	{
		return Negation();
	}

	public MathProposition Or(MathProposition p)
	{
		return Disjunction(p);
	}

	public MathProposition And(MathProposition p)
	{
		return Conjunction(p);
	}

	public MathBoolean Evaluate(MathObject x)
	{
		return result.apply(x);
	}

}
