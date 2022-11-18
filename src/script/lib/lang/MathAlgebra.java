package lib.lang;

import java.util.ArrayList;
import java.util.List;

// 代数
public interface MathAlgebra<D extends MathSet>
{
	public default <R extends MathSet> MathAlgebra<R> ope(MathCorrespondence<D, R> cor, MathAlgebra<D>[] operands)
	{
		//TODO FIX Later
//		return cor.operate(this);
		return null;
	}
}
