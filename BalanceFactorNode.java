
package A3;

public class BalanceFactorNode<T> {
	
	//variable declaration 
	private T data;
	private BalanceFactorNode<T> left;
	private BalanceFactorNode<T> right;
	private int height;
	
	//getters and setter for each variable
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public BalanceFactorNode(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BalanceFactorNode<T> getLeft() {
		return left;
	}

	public void setLeft(BalanceFactorNode<T> left) {
		this.left = left;
	}

	public BalanceFactorNode<T> getRight() {
		return right;
	}

	public void setRight(BalanceFactorNode<T> right) {
		this.right = right;
	}
}

