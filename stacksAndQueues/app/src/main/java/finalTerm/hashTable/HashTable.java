package finalTerm.hashTable;

import NodesPackage.TNode;

import java.util.*;

public class HashTable<K, V> {
private ArrayList<HashNode<K,V>> bucketArray ;
private int numBuckets;
  // size of the array
private int size;

  public HashTable() {
    this.bucketArray = new ArrayList<>();
    this.numBuckets = 10;
    this.size = 0;
    for (int i = 0 ; i<numBuckets; i++){
      this.bucketArray.add(null);
    }
  }

  public ArrayList<HashNode<K, V>> getBucketArray() {
    return bucketArray;
  }

  public int size() {
    return size;
  }
  boolean isEmpty(){
    return size()==0;
  }


// to get the hashCode of the key value :
  private final int hashCode(K key){
  return   Objects.hashCode(key);
  }

  /**
   * to get index of bucket in table
   * @param key
   * @return the index of the bucket
   */
  private int getBucketIndex(K key){
    int hashCode= hashCode(key);
    int index = hashCode% numBuckets;
    // for negative hashCodes :
    index = index<0 ? index*-1 : index;
    return index;
  }

  /**
   * removes a bucket
   * @param key
   * @return the value that has been removed
   */
  public V remove (K key ){
    int bucketIdx= getBucketIndex(key);
    int hashCode= hashCode(key);
    HashNode<K,V> head = bucketArray.get(bucketIdx);
    HashNode<K,V > prev = null;
    while (head!=null){
      if (hashCode==head.hashCode && head.key.equals(key)) break;
      prev=head;
      head=head.getNext();
    }
    if (head == null)
      return null;
    size--;
    if (prev!=null){prev.setNext(head.getNext());}
    else  bucketArray.set(bucketIdx, head.getNext());
    return head.value;
  }

  /**
   * adds key to to the table
   * @param key
   * @param value
   */
  public void add(K key , V value){
    int bucketIdx = getBucketIndex(key);
    int hashCode = hashCode(key);
    HashNode<K , V> head= bucketArray.get(bucketIdx);
    // in case the key was already added we check the key then add the value .
    while (head!=null)
    { if (head.key.equals(key) && key.hashCode()==hashCode){
      head.value=value;
      return;}
      head=head.getNext();
    }
    size++;
    // in case the key was not inserted , then create new bucket to the new key :
    head=bucketArray.get(bucketIdx);
    HashNode<K , V > newNode = new HashNode<>(key,value,hashCode);
    newNode.next=head;
    bucketArray.set(bucketIdx,newNode);


    if ((1.0 * size) / numBuckets >= 0.7) {
      ArrayList<HashNode<K, V> > temp = bucketArray;
      bucketArray = new ArrayList<>();
      numBuckets = 2 * numBuckets;
      size = 0;
      for (int i = 0; i < numBuckets; i++)
        bucketArray.add(null);

      for (HashNode<K, V> headNode : temp) {
        while (headNode != null) {
          add(headNode.key, headNode.value);
          headNode = headNode.next;}}}
  }


  /**
   * gets the value of a given key
   * @param key
   * @return value
   */
  public V get(K key)
  {
   // get the head of the linkedlist chain :
    int bucketIndex = getBucketIndex(key);
    int hashCode = hashCode(key);

    HashNode<K, V> head = bucketArray.get(bucketIndex);

    // Search key in chain
    while (head != null) {
      if (head.key.equals(key) && head.hashCode == hashCode)
        return head.value;
      head = head.next;
    }
    // in case there was no key found :
    return null;
  }


  public boolean contains(K key) {
    return get(key) != null;
  }



  public String checkRepeated(String string) throws Exception {
    String arrString[]=string.split(" ");
    HashTable<String,Integer> hashTable= new HashTable<>();
    for (String s: arrString){
      String lowerString= s.toLowerCase();
      if (hashTable.contains(lowerString))return lowerString;
      hashTable.add(lowerString,1);
    }
    return null;
  }

  public  static HashSet treeIntersection(TNode root1 , TNode root2 ){
    ArrayList<Object> arr1 = new ArrayList<>();
    arr1= treeIntersectionHelper(arr1,root1);

    ArrayList<Object> arr2 = new ArrayList<>();
    arr2= treeIntersectionHelper(arr2,root2);
    HashSet hashSet= new HashSet();
    for (Object value : arr1){
      if (arr2.contains(value))
        hashSet.add(value);

    }
    return hashSet;
  }

  private static ArrayList<Object> treeIntersectionHelper(ArrayList<Object> arr1, TNode node) {
    if (node==null ) return arr1;
    arr1.add(node.getData());
    treeIntersectionHelper(arr1,node.getLeft());
    treeIntersectionHelper(arr1,node.getRight());
    return arr1;
  }

//  @Override
//  public String toString() {
//    return "HashTable{" +
//      "bucketArray=" + bucketArray +
//      ", numBuckets=" + numBuckets +
//      ", size=" + size +
//      '}';
//  }


  public static HashTable<String,String[]> leftJoin(HashMap<String, String> synonyms, HashMap<String, String> antonymns){

    HashTable <String,String[]> haaash1= new HashTable<String,String[]>();
    synonyms.forEach((key,value)->{
      String[] values= new String[2];
      values[0]=value;
      values[1]=antonymns.get(key);
      haaash1.add(key,values);

    });
    return haaash1;

  }

}
