package NodesPackage;

public class TNode {
   TNode right ;
  TNode left ;
  int data ;

  public TNode() {
  }

  public TNode getRight() {
    return right;
  }
  public TNode (int data){
    this.data= data;
  }

  public void setRight(TNode right) {
    this.right = right;
  }

  public TNode getLeft() {
    return left;
  }

  public void setLeft(TNode left) {
    this.left = left;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }
}
