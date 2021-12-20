package stacksAndQueues;

import java.util.NoSuchElementException;

public class Queue <T>{
  QNode front , rear;

  public QNode getFront() {
    return front;
  }

  public QNode getRear() {
    return rear;
  }

  public Queue() {
    this.front = null;
    this.rear = null;

  }

  public void enqueue (int value ){
    QNode newNode = new QNode(value);
    if (front ==null ){
      front= newNode;
      rear=newNode;
    }
    else {
      QNode curr = front;

      this.rear.next=newNode;
      rear=newNode;

    }
    System.out.println(value +"  has been added! ");
  }

  public String toString(){
    String result = "";
   QNode current = front;
   QNode final1 = rear;
    while (current!= null ) {
      result += "{" + current.getData() + "} ->";
      current = current.getNext();
    }
    result +="Null";
    return result;
  }




  public int dequeue (){
    if (front == null ){
      System.out.println("queue is empty !");

    }
    QNode popped = front;
    front=front.next;
    if (this.front == null)
      this.rear = null;
    return (int) popped.getData();
  }

  public int peek (){
    if (front == null ){
      throw new NoSuchElementException();

    }
    QNode peeked = front;

    if (this.front == null)
      this.rear = null;
    return (int) peeked.getData();
  }

  public Boolean isEmpty (){
    return front == null;
  }

}

