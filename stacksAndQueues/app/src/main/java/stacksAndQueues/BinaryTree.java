package stacksAndQueues;

import NodesPackage.KAryNode;
import NodesPackage.TNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class BinaryTree {
TNode root ;

  ArrayList <Integer> arrInOrder = new ArrayList();
  ArrayList <Integer> arrPreOrder = new ArrayList();
  ArrayList <Integer> arrPostOrder = new ArrayList();
  int max = Integer.MIN_VALUE;
  int sum = 0;
  String res = "";
  TNode MNode = new TNode();

  public BinaryTree() {
  }

  public BinaryTree(TNode root) {
    this.root = root;
  }

  public TNode getRoot() {
    return root;
  }

  public void setRoot(TNode root) {
    this.root = root;
  }

  public ArrayList <Integer> inOrder(TNode node ){

  if (node== null ){
    return arrInOrder ;
  }

  inOrder(node.getLeft());
    arrInOrder.add(node.getData());
  inOrder(node.getRight());
  return arrInOrder;
}

  public ArrayList <Integer> preOrder( TNode node ){

    if (node== null ){
      return arrPreOrder ;
    }
    arrPreOrder.add(node.getData());
    preOrder( node.getLeft());

    preOrder(node.getRight());
    return arrPreOrder;
  }

  public ArrayList <Integer> postOrder( TNode node ){

    if (node== null ){
      return arrPostOrder ;
    }
    postOrder(node.getLeft());
    postOrder(node.getRight());
    arrPostOrder.add(node.getData());

    return arrPostOrder;
  }



  public int findMaxVal(){
  max = Integer.MIN_VALUE;
   return maximumValue(max ,root);


  }

public int maximumValue(int max , TNode node){

if (node == null) return max;
  max = node.getData();
int rightMax = maximumValue(max , node.getRight());
int leftMax = maximumValue(max,node.getLeft());
if (rightMax>max) max=rightMax;
if (leftMax>max) max=leftMax;

return max;


}




  public ArrayList<TNode> Breadth1stTraverse( BinaryTree tree){
    if (tree.getRoot()==null) throw new NullPointerException();

    TNode node=new TNode();

      ArrayList<TNode> arrayList=new ArrayList<TNode>();
      Queue<TNode> q= new LinkedList<>();
      q.add(tree.getRoot());

      while (q.peek()!=null){
         node = q.remove();
         arrayList.add(node);
          if (node.getLeft()!=null) q.add(node.getLeft());
          if (node.getRight()!=null) q.add(node.getRight());
      }
return arrayList;


  }

public  int sumOfOddNums( TNode root){
    if ( root == null) return sum;


  sumOfOddNums(root.getLeft());
  if (root.getData() %2 !=0)
    sum+= root.getData();
sumOfOddNums(root.getRight());
return sum;
}

  /**
   * to check if two trees are same
   * @param A
   * @param B
   * @return boolean
   */
  public boolean isSameTree(TNode A, TNode B) {


    if (B==null&& A==null) return true;
    if (A == null) return false;
    if (B == null) return false;

    if (A.getData()!= B.getData())return false;

  return   isSameTree(A.getLeft(),B.getLeft()) &&
    isSameTree(A.getRight(),B.getRight());
  }

  /**
   * check if the tree is symmetric i.e : mirror to it's self
   * @param node
   * @param node2
   * @return
   */
  public boolean isSymmetric(TNode node , TNode node2){
    if (node2==null&&node==null) return true;

    if ( node!=null && node2!=null&& node.getData()==node2.getData())
    return isSameTree(node.getLeft(),node2.getLeft())&& isSymmetric(node.getRight(), node2.getRight());
    return false;
  }



}
