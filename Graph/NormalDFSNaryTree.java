import java.util.*;
class NormalDFSNaryTree { 
   
    public static void dfs(int i,LinkedList list[], boolean visited[])
    {
        System.out.print(i+"   ");
        visited[i]=true;

        Iterator<Integer> iter = list[i].iterator();
        while(iter.hasNext())
        {
            int val = iter.next();
            if(visited[val]==false)
            {
                dfs(val,list,visited);
            }
        }
    }
    public static void main(String[] args)  
    { 
        int nodes = 5; 
       
        LinkedList<Integer> list[] = new LinkedList[5];      
          
        for (int i = 0; i < list.length; i ++){ 
            list[i] = new LinkedList<Integer>(); 
        } 

        list[0].add(1); 
        list[1].add(0); 
       
        list[0].add(2); 
        list[2].add(0); 
       
        list[1].add(3); 
        list[3].add(1); 
       
        list[2].add(4); 
        list[4].add(2); 

        boolean visited[]= new boolean[5];
        for(int i=0;i<5;i++)
        {
            visited[i]=false;
        }
        for(int i=0;i<5;i++)
        {
            if(visited[i]==false)
            {
                dfs(i,list,visited);
            }
        }
    } 
} 