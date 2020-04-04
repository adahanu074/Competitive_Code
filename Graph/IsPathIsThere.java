import java.util.*;
public class IsPathIsThere
{
    int V;
    ArrayList<Integer> [] array;
    int flag = 0;
    public IsPathIsThere(int V)
    {
        this.V = V;
        array = new ArrayList[V];

        for(int i=0;i<V;i++)
        {
            array[i] = new ArrayList<Integer>();
        }
    }

    public void addEdge(int a , int b)
    {
        array[a].add(b);
        // array[b].add(a);
    }

    public void printStack(Stack<Integer> stack)
    {
        List<Integer> list = new ArrayList<Integer> (stack);
        System.out.println(list); 
    }
    public void checkPath(int a ,int b, boolean isvisited [], Stack<Integer> stack)
    {
        isvisited[a] = true;
        for(int x : array[a])
        {
            if(!isvisited[x])
            {
                stack.push(x);
                if(x==b)
                {
                    // printStack(stack);
                    flag=1;
                }
                checkPath(x,b,isvisited,stack);
                stack.pop();
            }
        }

    }
    public boolean isReachable(int a , int b)
    {
        boolean isvisited[] = new boolean[V];
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<V;i++)
        {
            if(i==a)
            {
                stack.push(a);
                checkPath(i,b,isvisited,stack);
            }
        }
        if(flag == 1)
        {
            return true;
        }
        return false;
    }
     // Create a graph given in the above diagram 

     public static void main(String [] args)
     {
    IsPathIsThere g = new IsPathIsThere(4); 
     g.addEdge(0, 1); 
     g.addEdge(0, 2); 
     g.addEdge(1, 2); 
     g.addEdge(2, 0); 
     g.addEdge(2, 3); 
     g.addEdge(3, 3); 

    //  int u = 1; 
    //  int v = 3; 
    //  if (g.isReachable(u, v)) 
    //      System.out.println("There is a path from " + u +" to " + v); 
    //  else
    //      System.out.println("There is no path from " + u +" to " + v);

    int u = 3; 
    int v = 1; 
     if (g.isReachable(u, v)) 
         System.out.println("There is a path from " + u +" to " + v); 
     else
         System.out.println("There is no path from " + u +" to " + v);; 
        } 
}