package stacksAndQueues;

public class maxStack {
  private  StackAsLinkedList  getMaxNum =new StackAsLinkedList();

public int maxNum (StackAsLinkedList maxStack){
  int temp = 0 ;


  while (maxStack.top !=null){
    int popMax = maxStack.pop();
    if (popMax>temp)
    temp = popMax;

  }
  return  temp;
}
}
