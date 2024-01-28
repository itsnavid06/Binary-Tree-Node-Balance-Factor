

package A3;

public class BalanceFactorMain {
	public static void main(String[] args) {
//		Node a = new Node("A");
//		Node b = new Node("B");
//		Node c = new Node("C");
//		Node d = new Node("D");
//		Node e = new Node("E");
//		Node f = new Node("F");
//		
//		b.setLeft(a);
//		c.setLeft(d);
//		b.setRight(c);
//		e.setLeft(b);
//		e.setRight(f);
//		
//		BalanceFactors.BalanceFactors(e);
		
		BalanceFactorNode a = new BalanceFactorNode("A");
		BalanceFactorNode b = new BalanceFactorNode("B");
		BalanceFactorNode c = new BalanceFactorNode("C");
		BalanceFactorNode d = new BalanceFactorNode("D");
		BalanceFactorNode e = new BalanceFactorNode("E");
		
		b.setRight(a);
		c.setLeft(b);
		d.setLeft(c);
		d.setRight(e);
		
		System.out.println("------------------------------------------");
		BalanceFactors.BalanceFactors(d);
		System.out.println("------------------------------------------");
	}
}
