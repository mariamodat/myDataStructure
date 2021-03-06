/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stacksAndQueues;

import NodesPackage.TNode;
import finalTerm.MergeSort;
import finalTerm.QuickSort;
import finalTerm.hashTable.HashTable;
import finalTerm.hashTable.LeftJoins;
import graphs.Graph;
import graphs.Vertex;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class App {

  public static void main(String[] args) {

//      HashTable<String,Integer> hashTable= new HashTable<>();
//      hashTable.add("Mariam" , 811);
//      hashTable.add("Mariam" , 12);
//      System.out.println(hashTable.get("Mariam"));

//
//      TNode binaryTreeNode ;
//      BinaryTree binaryTree;
//      TNode binaryTreeNode2 = new TNode();
//      BinaryTree binaryTree2;
//
//      binaryTreeNode = new TNode(1);
//        binaryTree = new BinaryTree(binaryTreeNode);
//
//        binaryTreeNode.setLeft(new TNode(2));
//        binaryTreeNode.setRight(new TNode(3));
//        binaryTree.getRoot().getLeft().setLeft(new TNode(4));
//        binaryTree.getRoot().getLeft().setRight(new TNode(5));
//        binaryTree.getRoot().getRight().setLeft(new TNode(6));
//        binaryTree.getRoot().getRight().setRight(new TNode(7));
//
//        // second tree
//      binaryTreeNode2 = new TNode(8);
//        binaryTree2 = new BinaryTree(binaryTreeNode2);
//
//        binaryTreeNode2.setLeft(new TNode(9));
//        binaryTreeNode2.setRight(new TNode(6));
//        binaryTree2.getRoot().getLeft().setLeft(new TNode(10));
//        binaryTree2.getRoot().getLeft().setRight(new TNode(4));
//        binaryTree2.getRoot().getRight().setLeft(new TNode(11));
//        binaryTree2.getRoot().getRight().setRight(new TNode(12));
//
//
//      String expected= HashTable.treeIntersection(binaryTreeNode,binaryTreeNode2).toString();
//
//      System.out.println(expected+ "  <<<<<<<<<<<<<<<<<<<<<<<<");

//      LeftJoins leftJoins= new LeftJoins();
//      HashMap<String,String> h1= new HashMap<>();
//      HashMap<String,String> h2= new HashMap<>();
//      h1.put("Mariam" , "hello");
//      h1.put("Yousef" , "hello2");
//      h1.put("Sara" , "hello3");
//
//      h2.put("Mariam" , "hello4");
//      h2.put("Yousef" , "hello5");
//      h2.put("Dana" , "hello6");


//      StackAsLinkedList stack1= new StackAsLinkedList() ;
//      stack1.push(11);
//      stack1.push(3);
//      System.out.println(" the full stack is  "+stack1);
//      System.out.println(" the popped is  "+stack1.pop());
//      System.out.println(" is Empty ? "+stack1.isEmpty());
//      System.out.println(stack1.pop());
//      System.out.println(stack1);
//      System.out.println(stack1.toString());

//      System.out.println(">>>>>>><<<<<<<<");
//      Queue queue = new Queue();
//      queue.enqueue(4);
//      queue.enqueue(6);
//
//      System.out.println(queue.peek());
//      System.out.println(queue.toString());
//      System.out.println("the Item has been deleted :  "+queue.dequeue());

//      BinaryTree tree = new BinaryTree();
//      TNode node = new TNode(1);
//      node.setRight(new TNode(4));
//      node.setLeft(new TNode(9));
//      node.getLeft().setRight(new TNode(11));
//      node.getLeft().setLeft(new TNode(14));
//      node.getRight().setRight(new TNode(1));
//      node.getRight().setLeft(new TNode(50));
//      tree.breadthFirstTraverse(node);


    //..........................................................................................
//      PseudoQueue Q1= new PseudoQueue();
//      Q1.enQueue(2);
//      Q1.enQueue(8);
//      Q1.enQueue(11);
//      System.out.println("Value has been dequeued !  "+Q1.deQueue());
    // ..............................................................................................
    // Shelter code challenge :
//      ArrayList animals = new ArrayList();
//      Cats meeaw = null;
//      meeaw.setName("Sherazi ");
//      animals.add(1, meeaw);
//      Cats cat2= null;
//      cat2.setName("hetler ");
//      AnimalShelter shelter = new AnimalShelter();
//      shelter.enqueue(cat2);
//      MergeSort mergeSort = new MergeSort();
//      int arr[] = {2,3,5,7,13,11};
//
//      mergeSort.mergeSort(arr);
//      System.out.println(Arrays.toString(arr));


//      Graph<String> graph = new Graph<>();
//
//      Vertex<String> vertex1 = graph.addNode("Mariam");
//      Vertex<String> vertex2 = graph.addNode("Yousef");
//      Vertex<String> vertex3 = graph.addNode("Sara");
//      Vertex<String> vertex4 = graph.addNode("Lora");
//      graph.addEdge(vertex1,vertex2,1);
//      graph.addEdge(vertex1,vertex3,5);
//      graph.addEdge(vertex2,vertex4,5);
//
//      Graph<String> g= new Graph<>();
//      graph.depthFirst(vertex1);
//      System.out.println();

    BinarySearchTree bst = new BinarySearchTree();

    bst.add(3);
    bst.add(4);
    bst.add(0);
    bst.add(6);
    bst.add(11);
    bst.add(11);
    bst.add(5);

    BinarySearchTree bst2 = new BinarySearchTree();

    bst2.add(3);
    bst2.add(4);
    bst2.add(0);
    bst2.add(5);
    bst2.add(11);
    bst2.add(11);
    bst2.add(5);
    System.out.println(" check if the key is in the tree  >> " + bst.search(bst.getRoot(), 11));
    System.out.println(" check if two trees are the same >> " + bst.isSameTree(bst.getRoot(), bst2.getRoot()));

    // check is symmetric
    BinarySearchTree BSTisSymmetric = new BinarySearchTree();
    TNode root = new TNode(2);
    BSTisSymmetric.setRoot(root);
    BSTisSymmetric.getRoot().setLeft(new TNode(5));
    BSTisSymmetric.getRoot().setRight(new TNode(5));
    BSTisSymmetric.getRoot().getRight().setLeft(new TNode(3));
    BSTisSymmetric.getRoot().getLeft().setLeft(new TNode(3));
    System.out.println("is Symmetric tree? >> " + BSTisSymmetric.isSymmetric(root.getLeft(), root.getRight()));


    rotateArr(new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}});

    rotateArr(new int[][]{{3, 2, 1}, {3, 2, 1}, {3, 2, 1}});
  }
  public static  void rotateArr(int [][] arr){
    for(int i=0 ; i <3;i++){

      for(int j =2 ; j>=0 ;j--){

        System.out.print(arr[j][i] + " " ) ;
      }
      System.out.println();
    }
  }
}
