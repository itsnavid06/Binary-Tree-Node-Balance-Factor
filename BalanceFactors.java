
package A3;

public class BalanceFactors {
public static void BalanceFactors(BalanceFactorNode node) {
		
		// Get the left and right subtrees
		BalanceFactorNode left = node.getLeft();
		BalanceFactorNode right = node.getRight();
		
		// If this is a leaf node, set its height to 0
		if (left == null && right == null) {
			node.setHeight(0);
			return;
		}
		
		// Variables to store height of left and right subtrees
		int heightOnLeft = 0;
		int heightOnRight = 0;
		
		// Calculate height on left subtree
		if (left != null) {
			BalanceFactors(left);
			heightOnLeft = left.getHeight() + 1;
		}
		
		// Calculate height on right subtree
		if (right != null) {
			BalanceFactors(right);
			heightOnRight = right.getHeight() + 1;
		}
		
		// Calculate this node's height (the max of our left subtree and our right subtree)
		node.setHeight(Math.max(heightOnLeft, heightOnRight));
		
		// Calculate balance factor and print to screen
		int balanceFactor = Math.abs(heightOnLeft - heightOnRight);
		System.out.println("Node " + node.getData() + ", Balance Factor = " + balanceFactor);
	}
}


