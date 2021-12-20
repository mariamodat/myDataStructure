package stacksAndQueues.KArayTree;

import NodesPackage.KAryNode;
import stacksAndQueues.BinaryTree;
import stacksAndQueues.StackAsLinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class KAryTree {
  KAryNode KRoot;

  public KAryTree(KAryNode KRoot) {
    this.KRoot = KRoot;
  }

  /**
   * add new node to the tree
   * @param value
   * @return the new node
   */
  static KAryNode newNode(int value)
  {
    KAryNode nNode = new KAryNode();
    nNode.setKey(value);
    nNode.setChild(new Vector<KAryNode>());
    return nNode;
  }
  int idx=0;

  /**
   * create a K-ary Tree
   * @param k
   * @param n
   * @param arr
   * @param h
   * @return KAryNode of the created K tree
   */
  public KAryNode createKAryTree (int k , int n , int[] arr , int h ){
    if (n<=0 ) return null;
    KAryNode node = newNode(arr[idx]);
// loop through the number of children
 for (int i =0 ; i<k ; i++){

// check if the index of the data is less than the no.of nodes

   if (idx<n  && h>1 ){
      idx++ ;
      node.getChild().add(createKAryTree(k,n,arr,h-1)); // add the data children for each node
   }
   else  node.getChild().add(null);
 }
return  node;

}

//public void postOrderTraversal (KAryNode node , int k ){
//if (KRoot==null) return;
//  int i=0;
//while (i <k ){
// if (node.getChild().firstElement().getKey() %3 == 0)
//  postOrderTraversal(node.getChild().get(i),k);
//}
//
//}

  Stack <KAryNode> stack = new Stack<>();
//  Stack <KAryNode> stack2 = new Stack<>();
LinkedList list = new LinkedList();
LinkedList <String>  list2 = new LinkedList();
  public LinkedList fizzBuzzKTree (KAryNode node1 , KAryNode node2){
node2= node1;
if ( node1 ==null ) return null;
stack.push(node1);
//stack2.push(node2);
while (!stack.isEmpty()){
  KAryNode node = stack.pop();
//  KAryNode node22 = stack2.pop();
  list.add(node.getKey());
  list2.add(String.valueOf(node.getKey()));
  Collections.reverse(node.getChild());

  for (KAryNode n : node.getChild()){
    stack.add(n);
  }

}
list2.addAll(list) ;
for (String el : list2 )
{
  if(Integer.parseInt(el) %3 ==0)
  {
    el="Fizz";
  }

  if (Integer.parseInt(el) %5 ==0 )
    el="Buzz";
  if (Integer.parseInt(el) %3 ==0  && Integer.parseInt(el) %5 ==0 )
    el="fizzBuzz";
}

  return list2;



  }
}
