package stacksAndQueues;

import java.io.IOException;
import java.util.EmptyStackException;

public class StackAsLinkedList <T> {
  StackNode<T> top ;

  public StackNode getTop() {
    return top;
  }

  public  void push (int value ){
    StackNode newNode = new StackNode(value);
    if (top==null){
      top = newNode;
    }
    else {
      StackNode curr = top;
      top=newNode;
      newNode.setNext(curr);
    }
    System.out.println(value +"   has been pushed tp the List!");

  }

public  int pop ()   {
    if (top ==null)
    {
      throw  new EmptyStackException();
    }

  int popped = Integer.MIN_VALUE;


      popped= top.getData() ;
      top=top.getNext();
      return popped;




  }
  public  Boolean isEmpty (){
    if (top == null){return true;}
    else return false;
  }

  public String toString(){
    String result = "";
    StackNode current = top;
    while (current != null) {
      result += "{" + current.getData() + "} ->";
      current = current.getNext();
    }
    result +="Null";
    return result;
  }




  public  int peek (){
    if (top ==null)
    {
      System.out.println(" Stack is empty!! ");
    }
    int popped = Integer.MIN_VALUE;

    popped= top.getData() ;

    return popped;


  }

  public int maxNum (StackAsLinkedList minStack){
    int temp = 0 ;
    while (minStack.top !=null){
      if (minStack.pop()>temp)
        temp = minStack.pop();

    }
    return  temp;
  }

}
