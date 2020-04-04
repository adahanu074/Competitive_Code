import java.util.*;
class LevelOfEachNode
{
    int V;
    LinkedList<Integer> adj[];

    LevelOfEachNode(int V)
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

    public void getLevel()
    {
        int level[] = new int[V];
        level[0]=0;
        Queue<Integer> list =new LinkedList<Integer>();
        list.add(0);
        list.add(-1);
        int count=1;
        level[0]=0;
        while(list.size()!=0)
        {
            int v = list.poll();
            if(v==-1)
            {
                count++;
                list.add(-1);
                v=list.poll();
                if(v==-1)
                {
                    break;
                }   
            }
            Iterator<Integer>  iter = adj[v].iterator();
            while(iter.hasNext())
            {   
                int val = iter.next();
                level[val]=count;
                list.add(val);
            }
        }
        for(int k=0;k<V;k++)
        {
            System.out.print(level[k]+" ");
        }
    }

    public static void main(String [] args)
    {
        LevelOfEachNode g3 = new LevelOfEachNode(8);
        g3.addEdge(0, 1); 
        g3.addEdge(0, 2); 
        g3.addEdge(1, 3); 
        g3.addEdge(1, 4); 
        g3.addEdge(1, 5); 
        g3.addEdge(2, 5); 
        g3.addEdge(2, 6); 
        g3.addEdge(6, 7); 
        g3.getLevel();
    }
}