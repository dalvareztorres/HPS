package Nodes;

import java.lang.reflect.Method;

public class Subtract extends BinaryOperator {

	public Subtract(Token left, Token right) {
		super(left, right);
	}
	
	public Object evaluate() {
		return evaluate(getLeft().evaluate(), getRight().evaluate());
	}
	
	private Object evaluate(Object left, Object right)  {
		if (check(left, right)) return null;
		try {
			return getMethod(left, right).invoke(this, new Object[] {left, right});
		}
		catch (Exception ex) {
			return null;
		}
	}
	
	
	public Integer subtract(Integer arg0, Integer arg1) {
		return arg0 - arg1;
	}
	
	public Double subtract(Integer arg0, Double arg1) {
		return arg0 - arg1;
	}

	public Double subtract(Double arg0, Integer arg1) {
		return arg0 - arg1;
	}

	public Double subtract(Double arg0, Double arg1) {
		return arg0 - arg1;
	}

	private Method getMethod(Object left, Object right) throws NoSuchMethodException {
		return getClass().getMethod("subtract", left.getClass(), right.getClass());
	}

	private boolean check(Object left, Object right) {
		if (left == null) return true;
		if (right == null) return true;
		return false;
	}


}