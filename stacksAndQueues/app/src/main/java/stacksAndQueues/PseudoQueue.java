package stacksAndQueues;

public class PseudoQueue {
  static StackAsLinkedList stack1 =new StackAsLinkedList();
  static StackAsLinkedList stack2 =new StackAsLinkedList();



  public void enQueue(int val){
    while (!stack1.isEmpty()){
      stack2.push(stack1.pop());
    }
    stack1.push(val);
    while (!stack2.isEmpty()){
      stack1.push(stack2.pop());
    }
  }


  public  int deQueue (){
    if (stack1.isEmpty()){
      System.out.println("  Queue is empty!! ");
    }
    // Return top of s1
    int x = stack1.peek();
    stack1.pop();
    return x;
  }


  @Override
  public String toString() {
    return super.toString();
  }
}
