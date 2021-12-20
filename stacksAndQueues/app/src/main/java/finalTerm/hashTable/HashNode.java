package finalTerm.hashTable;

public class HashNode <K, V>{
  K key ;
  V value ;
  int hashCode ;
  HashNode<K, V> next;


  public HashNode(K key, V value, int hashCode) {
    this.key = key;
    this.value = value;
    this.hashCode = hashCode;
  }

  public HashNode(K key) {
    this.key = key;

  }

  public V getValue() {
    return value;
  }

  public HashNode<K, V> getNext() {
    return next;
  }

  public void setNext(HashNode<K, V> next) {
    this.next = next;
  }

  @Override
  public String toString() {
    return "HashNode{" +
      "key=" + key +
      ", value=" + value +
      ", hashCode=" + hashCode +
      ", next=" + next +
      '}';
  }
}
