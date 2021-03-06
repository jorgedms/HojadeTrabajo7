public class BinaryTree<E> {
	
	protected E val;
	protected BinaryTree<E> parent;
	protected BinaryTree<E> left,right;
	
	public BinaryTree(){
		
	}
	
	public BinaryTree(E value){
		this.val = value;
	}
	
	
	public BinaryTree(E value, BinaryTree<E> left, BinaryTree<E> righte){
		this.val = value;
		if(left==null) {left = new BinaryTree<E>();}
	
	}
	
	public BinaryTree<E> left(){
		return left;
	}
	
	public BinaryTree<E> right(){
		return right;
	}
	public BinaryTree<E> parent(){
		return parent;
	}
	public void setLeft(BinaryTree<E> newLeft)
	{
	        if (left != null && left.parent() == this) left.setParent(null);
	        left = newLeft;
	        left.setParent(this);
	}
	   public void setRight(BinaryTree<E> newRight)
	    {

	        if (right != null && right.parent() == this) right.setParent(null);
	        right = newRight;
	        right.setParent(this);
	    }
	   protected void setParent(BinaryTree<E> newParent)
	    {
	        
	            parent = newParent;
	        
	    }
	
	
	

}
