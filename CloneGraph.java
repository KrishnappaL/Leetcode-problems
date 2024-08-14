package code2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import code2.Node;
class CloneGraph {
	public static void main(String[] args) {
		Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        List<Node> v = new ArrayList<Node>();
        v.add(node2);
        v.add(node4);
        node1.neighbors = v;
        v = new ArrayList<Node>();
        v.add(node1);
        v.add(node3);
        node2.neighbors = v;
        v = new ArrayList<Node>();
        v.add(node2);
        v.add(node4);
        node3.neighbors = v;
        v = new ArrayList<Node>();
        v.add(node3);
        v.add(node1);
        node4.neighbors = v;
		cloneGraph(node1);
	}
 public static void dfs(Node node , Node copy , Node[] visited){
     visited[copy.val] = copy;// store the current node at it's val index which will tell us that this node is now visited
          for(Node n : node.neighbors){
         if(visited[n.val] == null){
             Node newNode = new Node(n.val);
             copy.neighbors.add(newNode);
             dfs(n , newNode , visited);
         }else{
             copy.neighbors.add(visited[n.val]);
         }
     }
     
 }
 public static Node cloneGraph(Node node) {
     if(node == null) return null; // if the actual node is empty there is nothing to copy, so return null
     Node copy = new Node(node.val); // create a new node , with same value as the root node(given node)
     Node[] visited = new Node[101]; // in this question we will create an array of Node(not boolean) why ? , because i have to add all the adjacent nodes of particular vertex, whether it's visited or not, so in the Node[] initially null is stored, if that node is visited, we will store the respective node at the index, and can retrieve that easily.
     Arrays.fill(visited , null); // initially store null at all places
     dfs(node , copy , visited); // make a dfs call for traversing all the vertices of the root node
     return copy; // in the end return the copy node
 }
}