package stacksAndQueues;

import NodesPackage.TNode;

public class BinarySearchTree extends BinaryTree{
  public BinarySearchTree(TNode root) {
    super(root);
  }

  public BinarySearchTree() {
  }

  public void add(int value){
    if (root == null){
      root = (TNode) new TNode(value);
    }else{
      TNode current = root;
      traverse((TNode) current, value);
    }
  }

  public void traverse(TNode current, int key){
    if (key > current.getData()){
      if (current.getRight() == null){
        current.setRight(new TNode(key));
        return;
      }
      current = current.getRight();
    }
    else {
      if (current.getLeft() == null){
        current.setLeft(new TNode(key));
        return;
      }
      current = current.getLeft();
    }
    traverse(current, key);
  }
  public boolean containValue(int value){
    return inOrder(root).contains(value);
  }


  /**
   * to search a key inside a Binary Search Tree
   * @param root
   * @param key
   * @return boolean
   */
  public boolean search(TNode root , int key){
    if (root==null) return false;
    if (root.getData()==key) return true;
    if (root.getData()<key) return search(root.getRight(),key);
    if (root.getData()>key)  return search(root.getLeft(),key);
    return true;
  }

}
