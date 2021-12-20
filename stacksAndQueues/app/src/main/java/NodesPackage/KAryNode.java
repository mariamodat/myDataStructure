package NodesPackage;

import java.util.Vector;

public class KAryNode {
  int key ;
  Vector<KAryNode> child ;

  public KAryNode() {
  }

  public KAryNode(int key) {
    this.key = key;
  }

  public int getKey() {
    return key;
  }

  public void setKey(int key) {
    this.key = key;
  }

  public Vector<KAryNode> getChild() {
    return child;
  }

  public void setChild(Vector<KAryNode> child) {
    this.child = child;
  }
}
