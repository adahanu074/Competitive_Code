import java.util.*;
class MinSumPthTriangle
{
    public static int minimumTotal(ArrayList<ArrayList<Integer>> a) {
	    int n = a.size();
	    int arr[][] = new int[n][];
	    for(int i=0;i<n;i++)
	    {
	        int m=a.get(i).size();
	        arr[i]=new int[m];
	    }
	    
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<arr[i].length;j++)
	        {
	            arr[i][j]=a.get(i).get(j);
	        }
	    }
	    
	    for(int i=1;i<n;i++)
	    {
	        for(int j=0;j<arr[i].length;j++)
	        {
	            int sum1=Integer.MAX_VALUE;
	            int sum2=Integer.MAX_VALUE;
	            int sum3=Integer.MAX_VALUE;
	            if((j-1)>=0)
	            {
	                sum1 = arr[i][j]+arr[i-1][j-1];
	            }
	            if(j<a.get(i-1).size())
	            {
	                sum2 = arr[i][j]+arr[i-1][j];
	            }
	            if((j+1)<a.get(i-1).size())
	            {
	                sum3 = arr[i][j]+arr[i-1][j+1];
	            }
	            
	            arr[i][j]=Math.min(sum1,Math.min(sum2,sum3));
	        }
	    }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println("\n");
        }
	    int mini = Integer.MAX_VALUE;
	    for(int i=0;i<arr[n-1].length;i++)
	    {
	        if(arr[n-1][i]<mini)
	        {
	            mini=arr[n-1][i];
	        }
	    }
	    return mini;
	}
    public static void main(String [] args)
    {
        ArrayList<Integer> list1  = new ArrayList<>(Arrays.asList(9));
        ArrayList<Integer> list2  = new ArrayList<>(Arrays.asList(1 ,7));
        ArrayList<Integer> list3  = new ArrayList<>(Arrays.asList(2 ,3 ,6 ));
        ArrayList<Integer> list4  = new ArrayList<>(Arrays.asList(5, 5 ,8 ,1 ));
        ArrayList<Integer> list5  = new ArrayList<>(Arrays.asList(4 ,7 ,1, 3 ,8));
        ArrayList<Integer> list6  = new ArrayList<>(Arrays.asList(4, 8 ,0 ,4, 6 ,0));
        ArrayList<Integer> list7  = new ArrayList<>(Arrays.asList(3 ,2 ,6, 9 ,4, 1 ,3));
        ArrayList<Integer> list8  = new ArrayList<>(Arrays.asList(7 ,8, 8, 3 ,8, 1, 5 ,3));
        ArrayList<Integer> list9  = new ArrayList<>(Arrays.asList(5, 4 ,3 ,6, 5, 9 ,5, 4, 9));
        ArrayList<Integer> list10  = new ArrayList<>(Arrays.asList(1 ,7, 5, 5, 4 ,1, 8 ,8, 3, 5));
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<ArrayList<Integer>>();
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        mainList.add(list4);
        mainList.add(list5);
        mainList.add(list6);
        mainList.add(list7);
        mainList.add(list8);
        mainList.add(list9);
        mainList.add(list10);
        System.out.println(minimumTotal(mainList));
    }
}
