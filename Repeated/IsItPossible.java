import java.util.*;
public class IsItPossible
{
    static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    static boolean flag = false;
    public static boolean issafe(int i, int j, int n, boolean graph[][])
    {
        if(i<0 || j<0 || i>=n || j>=n || graph[i][j]==true)
        {
            return false;
        }
        return true;
    }
    public static void traverse(int arr[][], int i,int j , int n, int value,boolean graph[][])
    {
       graph[i][j]=true;
       System.out.println("hello "+value);
     
        if(value==(n*n))
       {
            flag=true;
            graph[i][j]=false;
            return;
       }
        if(issafe(i,j-1,n,graph)==true)
       {
        if(arr[i][j]>=arr[i][j-1])
        {   
            // graph[i][j+1]=true;
            System.out.println("1");
            traverse(arr,i,j-1,n,value+1,graph);
        }
       }
       if(issafe(i-1,j,n,graph)==true)
       {
        if(arr[i][j]>=arr[i-1][j]) 
        {  
            // graph[i-1][j]=true;
            System.out.println("2");
            traverse(arr,i-1,j,n,value+1,graph);
        }
       }
       if(issafe(i,j+1,n,graph)==true)
       {
        if(arr[i][j]>=arr[i][j+1])   
        {
            // graph[i][j+1]=true;
            System.out.println("3");
            traverse(arr,i,j+1,n,value+1,graph);
        }
       }
       if(issafe(i+1,j,n,graph)==true)
       {
        if(arr[i][j]>=arr[i+1][j])   
        {
            // graph[i+1][j]=true;
             System.out.println("4");
            traverse(arr,i+1,j,n,value+1,graph);
        }
       }
       graph[i][j]=false;
       return;
    }
    public static void giveCordinates(int arr[][], int n)
    {
        boolean graph[][] = new boolean[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                graph[i][j]=false;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int value =1;
                traverse(arr,i,j,n,value,graph);
                if(flag)
                {
                    ArrayList<Integer> list1 = new ArrayList<Integer>();
                    list1.add(i);
                    list1.add(j);
                    list.add(list1);
                }
                flag =false;
            }
        }
        System.out.println(list);
    }
    public static void main(String [] args)
    {
         int adj[][] = new int[][]{
                         {3,3}
                        ,{1,1}};
        
    giveCordinates(adj,2);
    System.out.println(flag);
    }

}