package graphs;

import java.util.Objects;

public class Vertex<K>{
  K value;


  public Vertex(K value ) {
    this.value = value;

  }

  public K getValue() {
    return value;
  }

  public void setValue(K value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object node) {

    return value.equals(node);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
