package hr.fer.oop.lab2.prob2;

class TreeNode {
    TreeNode left;
    TreeNode right;
    String data;
}

class TreeProgram {

  public static void main(String[] args) {
      TreeNode node = null;
	
	node = insert(node, "Jasna");
	node = insert(node, "Ana");
	node = insert(node, "Ivana");
	node = insert(node, "Anamarija");
	node = insert(node, "Vesna");
	node = insert(node, "Kristina");
	
	System.out.println("Writing tree inorder:");
	writeTree(node);
	boolean found = containsData(node, "Ivana");
	System.out.println("Searched element is found: "+found);

      node = reverseTreeOrder(node);	
	
	System.out.println("Writing reversed tree inorder:");
	writeTree(node);
	
	int size = sizeOfTree(node);
	System.out.println("Number of nodes in tree is "+size+".");
	
	found = containsData2(node, "Ivana");
	System.out.println("Searched element is found: "+found);
  }
  //works with normal tree, not reversed
  static boolean containsData(TreeNode treeRoot, String data) {
    if(treeRoot == null) {
    	return false;
    }
    if(data.compareTo(treeRoot.data) == 0) {
    	return true;
    }
    if(data.compareTo(treeRoot.data) < 0) {
    	return containsData(treeRoot.left, data);
    }
    if(data.compareTo(treeRoot.data) > 0) {
    	return containsData(treeRoot.right,data);
    }
    else return false;
  }
  
  static boolean containsData2(TreeNode treeRoot, String data) {
	return false;
  }
  
  static int sizeOfTree(TreeNode treeRoot) {
	  if (treeRoot == null) {
		  return 0;
	  }
	  else 
		  return 1 + sizeOfTree(treeRoot.left) + sizeOfTree(treeRoot.right);
  }

  static TreeNode insert(TreeNode treeRoot, String data) {
    if(treeRoot==null) {
    	treeRoot = new TreeNode();
    	treeRoot.data = data;
    	treeRoot.left = null;
    	treeRoot.right = null;	
    }
    //if inserted string is smaller than root str
    if(data.compareTo(treeRoot.data) < 0) {
    	treeRoot.left = insert(treeRoot.left,data);
    	
    }
    else if(data.compareTo(treeRoot.data) > 0 ) {
    	treeRoot.right = insert(treeRoot.right,data);
 
    }
    else {
    	return treeRoot;
    }
    return treeRoot;	
  }
  
  // in order, so first left sub tree, then root, then right sub tree
  static void writeTree(TreeNode treeRoot) {
    if(treeRoot!=null) { 	
    	writeTree(treeRoot.left);
    	System.out.println(treeRoot.data);
    	writeTree(treeRoot.right);
    }
  }
  
  //so, the left sub tree becomes the right subtree, and vice-versa
  static TreeNode reverseTreeOrder(TreeNode treeRoot) {
	 if(treeRoot==null) {
		  return treeRoot;
	  }
	  TreeNode tmp = treeRoot.left;
	  treeRoot.left = treeRoot.right;
	  treeRoot.right = tmp;
	  reverseTreeOrder(treeRoot.left);
	  reverseTreeOrder(treeRoot.right);
	  return treeRoot;
  }
}
