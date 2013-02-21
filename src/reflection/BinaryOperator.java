package reflection;

public class BinaryOperator {
	private Token left;
	private Token right;

	public BinaryOperator(Token left, Token right) {
		this.left = left;
		this.right = right;
	}

	public Token getLeft() {
		return left;
	}

	public Token getRight() {
		return right;
	}
	
}
