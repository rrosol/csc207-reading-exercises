
public class Tree<T extends Comparable<T>> {
	private static class Node<T> {
		public T value;
		public Node<T> left;
		public Node<T> right;


		public Node(T value, Node<T> left, Node<T> right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}


		public Node(T value) { this(value, null, null); }
	}


	private Node<T> root;

	public Tree() { root = null; }


	private static <T extends Comparable<T>> Node<T> insertH(T v, Node<T> cur) {
		if (cur == null) {
			return new Node<>(v);
		} else {
			if (v.compareTo(cur.value) < 0) {
				cur.left = insertH(v, cur.left);
			} else {
				cur.right = insertH(v, cur.right);
			}
			return cur;
		}
	}

	public void insert(T v) {
		root = insertH(v, root);
	}

	private static <T> void inOrderPrintHelper(Node<T> cur) {
		if (cur == null) {
			return;
		} else {
			inOrderPrintHelper(cur.left);
			System.out.println(cur.value);
			inOrderPrintHelper(cur.right);
		}
	}

	public void inorderPrint() {
		inOrderPrintHelper(root);
	}


	public void main(String[] args) {

		Tree<Integer> treeA = new Tree<>();
		treeA.insert(5);
		treeA.insert(2);
		treeA.insert(1);
		treeA.insert(4);
		treeA.insert(8);
		treeA.insert(6);
		treeA.insert(9);


		Tree<Integer> treeB = new Tree<>();
		treeB.insert(4);
		treeB.insert(2);
		treeB.insert(9);
		treeB.insert(6);
		treeB.insert(5);
		treeB.insert(15);
		treeB.insert(20);


		Tree<Integer> treeC = new Tree<>();
		treeC.insert(9);
		treeC.insert(6);
		treeC.insert(5);
		treeC.insert(2);
		treeC.insert(1);
	}
}


