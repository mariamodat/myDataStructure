package stacksAndQueues;

public class StackNode <T>{
  private int data ;
  private StackNode next ;

  public StackNode(int data) {
    this.data = data;
    this.next=null ;

  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public StackNode getNext() {
    return next;
  }

  public void setNext(StackNode next) {
    this.next = next;
  }
}
