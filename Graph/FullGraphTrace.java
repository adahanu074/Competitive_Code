import java.util.*;
public class FullGraphTrace
{
    static int V;
    static LinkedList<Integer> [] array;
    FullGraphTrace(int V)
    {
        this.V = V;
        array = new LinkedList[V];

        for(int i=0;i<V;i++)
        {
            array[i]= new LinkedList<Integer>();
        }
    }

    public static boolean DFS(int start , boolean isvisited[],int dest)
    {
        isvisited[start] = true;
        for(int j:array[start])
        {
            if(j==dest)
            {
                return true;
            }
            if(!isvisited[j]){
            DFS(j,isvisited,dest);
            }
        }
        return false;

    }
    public static boolean isTherePath (int src , int dest)
    {
        boolean isvisited[] = new boolean[V];
        int flag = 0;
        for(int x:array[src])
        {
            boolean value =false;
            if(!isvisited[x])
            {
               value = DFS(x,isvisited,dest);
            }
            if(value==true)
            {
                flag = 1;
                break;
            }
        }
        if(flag==1)
        {
            return true;
        }
        return false;
    }
    public void addEdge(int src , int dest)
    {
        array[src].add(dest);
        array[dest].add(src);
    }
    public static void main(String [] args)
    {
        FullGraphTrace full = new FullGraphTrace(5);
        full.addEdge(1, 0);  
        full.addEdge(2, 3);  
        full.addEdge(3, 4); 
        boolean value  = isTherePath(1,0);
        if(value==true)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}