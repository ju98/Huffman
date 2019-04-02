
public class Node {
	private String name;
	private int freq;
	private Node leftChild;
	private Node rightChild;
	
	public Node(String name, int freq, Node leftChild, Node rightChild) {
		this.name = name;
		this.freq = freq;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFreq() {
		return freq;
	}

	public void setFreq(int freq) {
		this.freq = freq;
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

}
