import java.util.LinkedList; 
import java.util.*;
public class GraphConnectedComponent { 
    // A user define class to represent a graph. 
    // A graph is an array of adjacency lists. 
    // Size of array will be V (number of vertices 
    // in graph) 
    int V; 
    LinkedList<Integer>[] adjListArray; 
      
    // constructor 
    GraphConnectedComponent(int V) { 
        this.V = V; 
        // define the size of array as 
        // number of vertices 
        adjListArray = new LinkedList[V]; 
  
        // Create a new list for each vertex 
        // such that adjacent nodes can be stored 
  
        for(int i = 0; i < V ; i++){ 
            adjListArray[i] = new LinkedList<Integer>(); 
        } 
    } 
      
    // Adds an edge to an undirected graph 
    void addEdge( int src, int dest) { 
        // Add an edge from src to dest. 
        adjListArray[src].add(dest); 
  
        // Since graph is undirected, add an edge from dest 
        // to src also 
        adjListArray[dest].add(src); 
    } 

    void DFS(int i ,boolean [] isvisited )
    {
        isvisited[i]= true;
        for (int x:adjListArray[i])
        {
            if(!isvisited[x]) 
            DFS(x,isvisited); 
        }
    }
    void connectedComponents() { 
        int count = 0;
        boolean [] isvisited = new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(!isvisited[i])
            {
                DFS(i, isvisited);
                count++;
            }
        }
        System.out.println(count);
    } 
      
    public static void main(String[] args){ 
        // Create a graph given in the above diagram  
        GraphConnectedComponent g = new GraphConnectedComponent(5); // 5 vertices numbered from 0 to 4  
          
        g.addEdge(1, 0);  
        g.addEdge(2, 3);  
        g.addEdge(3, 4); 
        System.out.println("Following are connected components"); 
        g.connectedComponents(); 
    } 
} 