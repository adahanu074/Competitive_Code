import java.util.*;
public class HashCode
{
    private static ArrayList<ArrayList<Integer>> pizzaSet = new ArrayList<ArrayList<Integer>>();
    private static ArrayList<ArrayList<Integer>> pizzaSetResult = new ArrayList<ArrayList<Integer>>();

    private static void comboOfPizza(int value, int pizza[])
    {
        int position = 0;
        ArrayList<Integer> oneSet = new ArrayList<Integer>();
        while(value>0)
        {   
            if((value&1)>0)
            {
                oneSet.add(pizza[position]);
            }
            value = (value>>1);
            position++;
        }
        if(oneSet.size()>0)
        {
            pizzaSet.add(oneSet);
        }
        
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int pizza []= new int[N];
        for(int i=0;i<N;i++)
        {
            pizza[i]= sc.nextInt();
        } 
        int range = (1<<N)-1;
        for(int i=1;i<=range;i++)
        {
            comboOfPizza(i,pizza);
        }
        int diff = Integer.MAX_VALUE;
        for(int i=0;i<pizzaSet.size();i++)
        {
            int result = 0;
            for(int j=0;j<pizzaSet.get(i).size();j++)
            {
                result = result + pizzaSet.get(i).get(j);
            }
            if(result < M)
            {
                if((M-result)< diff)
                {
                    diff = (M-result);
                    pizzaSetResult.clear();
                    pizzaSetResult.add(pizzaSet.get(i));
                    continue;
                }
                if((M-result) == diff)
                {
                    pizzaSetResult.add(pizzaSet.get(i));
                }
            }
        }

        Collections.sort(pizzaSetResult , new Comparator<ArrayList<Integer>>(){
            public int compare(ArrayList<Integer> list1 , ArrayList<Integer> list2)
            {
                if(list1.size()<list2.size())
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        });
        System.out.println(pizzaSetResult);
        Set<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>(pizzaSetResult);
        System.out.println(set);
    }
}