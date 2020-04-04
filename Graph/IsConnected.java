import java.util.*;
public class IsConnected
{
    
    int V;
    LinkedList<Integer> [] list;
    IsConnected(int V)
    {
        this.V=V;
        list = new LinkedList[V];

        for(int i=0;i<V;i++)
        {
            list[i]= new LinkedList<Integer>();
        }
    }
    public static addEdge(int src ,int dest)
    {
        list[src].add(dest);
    }

    boolean isReachable(int src , int dest)
    {
        
        
        Queue<Integer> queue = new Queue<Integer>();

    }

    public static void main(String [] args)
    {
        IsConnected g= new IsConnected(4);
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 


    }
}