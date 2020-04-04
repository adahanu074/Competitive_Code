class NumberOfNodesAtEveryLevel
{
    private int V;
    private LinkedList<Integer> adj[];
    
    NumberOfNodesAtEveryLevel(int V)
    {
        this.V = V;
        adj = new LinkedList[V];

        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }
    }

    private void addEdge(int src, int dest)
    {
        adj[src].add(dest);
    }

    private void BFS(int start, int level)
    {
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean visited[]= new boolean[V];

        queue.add(start);
        queue.add(-1);

        while(!queue.isEmpty())
        {
            int val = queue.poll();
            if(val==-1)
            {
                val = queue.poll();
                if(val==(-1))
                {
                    break;
                }
                level--;
                if(level<0)
                {
                    break;
                }
            }
            if(level==0)
            {
                System.out.print(val+"  ");
            }
            Iterator<Integer> iter = adj[val].iterator();
            while(iter.hasNext())
            {
                int value = iter.next();
                if(visited[value]==false)
                {
                    queue.add(value);
                    visited[value]=true;
                }
            }
        }
    }
    public static void main(String [] args)
    {
        NumberOfNodesAtEveryLevel g = new NumberOfNodesAtEveryLevel(6);
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 3); 
        g.addEdge(2, 4); 
        g.addEdge(2, 5); 
      
        int level = 2; 
      
        g.BFS(0, level);
    }
}