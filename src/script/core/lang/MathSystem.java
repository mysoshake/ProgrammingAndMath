package core.lang;

// **系
public class MathSystem<MATH_TYPE> extends MathObject
{
	private MATH_TYPE[] system;

	public MathSystem(MATH_TYPE... system)
	{
		this.system = system;
	}
}
