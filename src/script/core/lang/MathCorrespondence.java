package core.lang;

public interface MathCorrespondence<Domain extends MathSet, Range extends MathSet>
{
	public Range ope(Domain argument);
}
