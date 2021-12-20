package graphs;

import java.util.*;

public  class Graph<K> {

  private final Map<Vertex<K>, Map<Vertex<K>, Integer>> vertices;

  public Graph() {

    this.vertices = new HashMap<>();

  }

  public  Vertex<K> addNode(K data){

    Vertex<K> vertex = new Vertex<>(data);
    Map<Vertex<K>,Integer> values = new HashMap<>();
    vertices.putIfAbsent(vertex , values);

    return vertex;

  }

  public void addEdge(Vertex<K> vertex1, Vertex<K> vertex2){
    Map<Vertex<K>,Integer> values;

    vertices.get(vertex1).putIfAbsent(vertex2,0);
    vertices.get(vertex2).putIfAbsent(vertex1,0);
  }

  public void addEdge(Vertex<K> vertex1, Vertex<K> vertex2, Integer weight){
    Map<Vertex<K>,Integer> values;

    vertices.get(vertex1).putIfAbsent(vertex2,weight);
    vertices.get(vertex2).putIfAbsent(vertex1,weight);
  }

  public Set<Vertex<K>> getNodes(){
    return vertices.keySet();
  }

  public Map<Vertex<K>, Integer> getNeighbors(Vertex<K> vertex){
    return vertices.get(vertex);
  }

  public int size(){
    return vertices.keySet().size();
  }

  public List<Integer> getValues(Map<Vertex<K>,Integer> map){
    List<Integer> values = new ArrayList<>();
    for (Vertex<K> key:
      map.keySet()) {
      values.add(map.get(key));
    }
    return values;
  }

  public boolean contains(Map<Vertex<String>,Integer> map, String data){
    ArrayList<Vertex<String>> verticesArray = new ArrayList<>(map.keySet());

    for (Vertex<String> node:
      verticesArray) {
      if (node.getValue().equals(data)) return true;
    }
    return false;
  }


  @Override
  public String toString() {
    StringBuilder stringBuilder =new StringBuilder();
    for (Vertex<K> vertex:
      vertices.keySet()) {
      stringBuilder.append(vertex.getValue());
      stringBuilder.append(":");
      stringBuilder.append(this.getValues(vertices.get(vertex)));
      stringBuilder.append(" ; ");
    }
    return stringBuilder.toString();
  }

  /**
   * traverse a graph in breadth first approach
   * @param vertex
   * @return
   */
  public HashSet<Vertex<String>> breadthFirst(Vertex<String> vertex){
    Map<Vertex<K>,Integer> neighbors= getNeighbors((Vertex<K>) vertex);
    Queue<Vertex<String>> queue = new LinkedList<>();
    HashSet<Vertex<String>> visited = new LinkedHashSet<>();
    queue.add(vertex);
    visited.add(vertex);
    while (!queue.isEmpty()){
      Vertex<String> curr= queue.remove();

    for (Vertex vert: getNeighbors((Vertex<K>) curr).keySet()){

      if (!visited.contains(vert))
      {queue.add(vert);
        visited.add(vert);

      }}}
    Iterator<Vertex<String>> iterator= visited.iterator();
    while (iterator.hasNext()) System.out.println(iterator.next().getValue());
    return visited;
  }

  /**
   * get  edges of graph and calculate the cost of the trip
   * @param graph
   * @param cityNames
   * @return string
   */
  public  String businessTrip(Graph<String> graph, String[]cityNames  ){
  Vertex<String> v1=  graph.addNode("Mariam");
  Vertex<String> v2=graph.addNode("Sara");
  Vertex<String> v3=graph.addNode( "Lora");
  Vertex<String> v4=graph.addNode( "Yousef");

graph.addEdge(v1,v4,150);
graph.addEdge(v1,v2,60);
graph.addEdge(v2,v3,40);

int i=0 ;
int sum = 0 ;
    Queue<Vertex<String>> queue = new LinkedList<>();
Set<Vertex<String>> vertices = graph.getNodes();
for (Vertex<String> node : vertices){
  if (node.getValue()==cityNames[0]) {
    queue.add((Vertex<String>) node);
    while (!queue.isEmpty()) {
      Vertex<String> temp = queue.poll();
      Map<Vertex<String>, Integer> neighbors = graph.getNeighbors(temp);
      for (Vertex<String> vert : neighbors.keySet() ){
        if (Objects.equals(vert.value, cityNames[1])){
//          sum+=
        }
      }
    }
  }



  }
return null;
}




  /**
   * traverse a graph in depth first approach
   * @param vertex
   * @return
   */

  public HashSet <Vertex<K>> depthFirst(Vertex<K> vertex){
    Map<Vertex<K>,Integer> neighbors;
    Stack<Vertex<K >> stack = new Stack<>();
    HashSet<Vertex<K>> visited = new LinkedHashSet<>();
    stack.push(vertex);
    visited.add(vertex);
    while (!stack.isEmpty()){
      Vertex<K> popped= stack.pop();
      if (!visited.contains(popped)){
        visited.add(popped);
        for (Vertex<K> edge:
          this.vertices.get(popped).keySet()) {
          stack.add(edge);
        }
      }
    }
    Iterator<Vertex<K>> iterator= visited.iterator();
    while (iterator.hasNext()) System.out.println(iterator.next().getValue());
    return visited;
  }



}
