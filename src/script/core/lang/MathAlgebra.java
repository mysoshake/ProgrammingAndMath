package core.lang;

// 代数
public interface MathAlgebra<MathSet>
{
	public MathAlgebra operate(MathCorrespondence<MathSet, MathObject> cor);
}
