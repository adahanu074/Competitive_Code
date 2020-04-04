import java.util.*;
class LevelOfEachNode
{
    private int V;
    LinkedList<Integer> adj[];

    LevelOfEachNode(int V)
    {
        this.V = V;
        adj = new LinkedList[V];

        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList();
        }
    }

    private void addEdge(int src,int dest)
    {
        adj[src].add(dest);
    }

    private void getLevel(int src)
    {
        int level[] = new int[V];
        Arrays.fill(level,-1);
        level[src]=0;

        Queue<Integer> queue  = new LinkedList();
        queue.add(src);
        queue.add(-1);
        int lev =1 ;
        level[0]=0;
        while(!queue.isEmpty())
        {
            int val = queue.poll();
            if(val == -1)
            {
                queue.add(-1);
                val = queue.poll();
                if(val==(-1))
                {
                    break;
                }
                lev++;
            }
            Iterator<Integer> iter = adj[val].iterator();
            while(iter.hasNext())
            {
                int va = iter.next();
                if(level[va]==(-1))
                {
                    queue.add(va);
                    level[va]=lev;
                }
            }
        }
        for(int i=0;i<V;i++)
        {
            System.out.print(level[i]+"  ");
        }
    }
    public static void main(String args[]) 
{   

      LevelOfEachNode g = new LevelOfEachNode(8);
      g.addEdge(0,1);
      g.addEdge(0,2);
      g.addEdge(1,3);
      g.addEdge(1,4);
      g.addEdge(1,5);
      g.addEdge(2,5);
      g.addEdge(2,6);
      g.addEdge(6,7);  

      g.getLevel(0);
}  
}