import java.util.*;
class HeightGenericParentArray
{
    int V;
    LinkedList<Integer> adj[];

    HeightGenericParentArray(int V)
    {
        this.V=V;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList();
        }
    }

    public void addEdge(int src,int dest)
    {
        adj[src].add(dest);
    }

    public void height()
    {
        int parent[] = new int[V];
        parent[0]=-1;
        Queue<Integer> queue = new LinkedList();
        queue.add(0);
        queue.add(-1);
        int count =0;
        while(!queue.isEmpty())
        {
            int val = queue.poll();
            if(val==-1)
            {
                count++;
                queue.add(-1);
                int va = queue.poll();
                if(va==-1)
                {
                    break;
                }
            }
            else
            {
                Iterator<Integer> iter = adj[val].iterator();
                while(iter.hasNext())
                {
                    int vall = iter.next();
                    parent[val]=count;
                    queue.add(vall);
                }
            }
        }
        for(int i=0;i<V;i++)
        System.out.print(parent[i]+"  ");
    }
    public static void main(String [] args)
    {
        HeightGenericParentArray g3 = new HeightGenericParentArray(8);
        g3.addEdge(0, 1); 
        g3.addEdge(0, 2); 
        g3.addEdge(1, 3); 
        g3.addEdge(1, 4); 
        g3.addEdge(1, 5); 
        g3.addEdge(2, 5); 
        g3.addEdge(2, 6); 
        g3.addEdge(6, 7); 

        g3.height();
    }
}