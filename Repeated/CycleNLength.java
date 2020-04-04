import java.util.*;
class CycleNLength
{
    private static int count = 0;
    private static boolean dfs(int v, int arr[][], int n, int parent[],boolean visited[])
    {
        if(visited[v]==true)
        {
            return true;
        }
        visited[v]=true;
        System.out.println(n);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[v][i]==1)
            {
                parent[i]=v;
                // System.out.println(n);
                if(dfs(i,arr,n-1,parent,visited) && parent[v]!=i)
                {
                    if(n==1){
                        count++;
                        return true;
                    }
                    return false;
                }
            }
        }
        visited[v]=false;
        return false;
    }
    
    private static int countCycles(int arr[][], int n)
    {
        int len = arr.length;
        boolean [] visited = new boolean[len];
        int parent[] = new int[len];       
        for(int i=0;i<len;i++)
        {
            visited[i]=false;
            parent[i]=-1;
        }
        System.out.println("bdfdfggd");
        for(int i=0;i<len;i++)
        {
            
            n=4;
            if(visited[i]==false)
            {
             dfs(i,arr,n,parent,visited);
            }
        }
        return 1;
    } 
    public static void main(String[] args) { 
        int graph[][] = {{0, 1, 0, 1, 0}, 
                        {1, 0, 1, 0, 1}, 
                        {0, 1, 0, 1, 0}, 
                        {1, 0, 1, 0, 1}, 
                        {0, 1, 0, 1, 0}}; 
          
        int n = 4; 
        countCycles(graph,n);
        System.out.println("Total cycles of length "+ 
                          n + " are "+  
                          count); 
    } 
}