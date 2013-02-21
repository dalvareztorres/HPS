package reflection;

public class Constant<T> implements Token {
	
	private T value;

	public Constant(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
	
	@Override
	public Object evaluate() {
		return value;
	}

}
