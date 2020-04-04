import java.util.*;
public class CountAllPossiblePath
{
    int V ;
    LinkedList<Integer> [] array;
    // public static Set<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();

    CountAllPossiblePath(int V)
    {
        this.V = V;
        array = new LinkedList[V];

        for(int i=0;i<V;i++)
        {
            array[i]= new LinkedList<Integer>();
        }
    }

    public void addEdge(int a , int b)
    {
        array[a].add(b);
    }

    // public void addinset(Stack<Integer> stack)
    // {
    //     ArrayList<Integer> list = new ArrayList<>(stack);
    //     set.add(list);
    // }
    public int count(int a, int b, boolean [] isvisited , int path)
    {
        isvisited[a]=true;
        if(a==b)
        {
            path++;
        }
        else
        {
        for(int x : array[a])
        {
            if(!isvisited[a])
            {
                count(x,b,isvisited,path);
            }
        }
    }
        isvisited[a]=false;
        return path;
    }

    public void countPaths(int a , int b)
    {
        boolean isvisited [] = new boolean[V];
        Arrays.fill(isvisited, false); 
        int path = 0;
        path = count(a,b,isvisited, path);
        System.out.println(path);
        // boolean isvisited [] = new boolean[V];
        // Stack<Integer> stack = new Stack<Integer>();
        // isvisited[a] = true;
        // stack.push(a);
        // if(a==b)
        // {
        //     addinset(stack);
        //     isvisited[a]=false;
        //     return;
        // }
        // for(int x : array[a])
        // {
        //     if(!isvisited[x])
        //     {
        //         countPaths(x,b);
        //     }
        // }

    }

    public static void main(String args[])  
    { 
        CountAllPossiblePath g = new CountAllPossiblePath(4); 
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(0, 3); 
        g.addEdge(2, 0); 
        g.addEdge(2, 1); 
        g.addEdge(1, 3); 
  
        int s = 2;
        int d = 3; 
        g.countPaths(s, d);
    } 

}