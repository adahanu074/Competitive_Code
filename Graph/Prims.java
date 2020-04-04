import java.util.*;
class Prims
{
    int V =5;

    public int getMinIndex(int key[],boolean memset[])
    {
        int min = Integer.MAX_VALUE;
        int lowestIndex = -1;
        for(int i=0;i<V;i++)
        {
            if(memset[i]==false && key[i]<min)
            {
                min=key[i];
                lowestIndex =i;
            }
        }
        return lowestIndex;
    }

    void printMST(int parent[], int graph[][]) 
    { 
        System.out.println("Edge \tWeight"); 
        for (int i = 1; i < V; i++) 
            System.out.println(parent[i] + " - " + i + "\t" + graph[parent[i]][i]); 
    }

    public void primsMin(int graph[][])
    {
        int key [] = new int[V];
        int parent[] = new int[V];

        boolean memset[] =new boolean[V];

        for(int i=0;i<V;i++)
        {
            key[i]=Integer.MAX_VALUE;  
        }

        parent[0]=-1;
        key[0]=0;
        for(int i=0;i<V-1;i++)
        {
            int x = getMinIndex(key,memset);
            memset[x]=true;
            for(int j=0;j<V;j++)
            {
                if(graph[x][j]!=0 && memset[j]==false && graph[x][j]<key[j])
                {
                    key[j]=graph[x][j];
                    parent[j]=x;
                }
            }
        }
        printMST(parent,graph);
    }
    public static void main(String [] args)
    {
        Prims t = new Prims(); 
        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 }, 
                                      { 2, 0, 3, 8, 5 }, 
                                      { 0, 3, 0, 0, 7 }, 
                                      { 6, 8, 0, 0, 9 }, 
                                      { 0, 5, 7, 9, 0 } }; 
        t.primsMin(graph);
  
    }
}