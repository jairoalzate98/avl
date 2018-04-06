package models;

public class Node{

	private int information;
	private Node right;
	private Node left;

	public Node(int information){
		this.information = information;
	}
	
	public void setRight(Node node){
			this.right = right;
	}
	
	public void setLeft(Node node){
			this.left = left;
	}
	
	public int getInformation(){
		return information;
	}
	
	public Node getRight(){
		return right;
	}
	
	public Node getLeft(){
		return left;
	}
}