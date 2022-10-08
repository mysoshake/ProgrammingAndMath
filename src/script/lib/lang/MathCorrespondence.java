package lib.lang;

public interface MathCorrespondence<Domain extends MathSet, Range extends MathSet>
{
	public Range operate(Domain ... argument);
}
