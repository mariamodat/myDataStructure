package stacksAndQueues;

public class QNode<T> {
T data;
QNode next ;

  public QNode(T data) {
    this.data = data;
    this.next=null ;
  }

  public T getData() {
    return data;
  }


  public QNode getNext() {
    return next;
  }

  public void setNext(QNode next) {
    this.next = next;
  }
}
