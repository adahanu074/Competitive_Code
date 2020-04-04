import java.util.*;
public class PairSum
{
    public static void findPair(int arr[],int val)
    {
     ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
     Arrays.sort(arr);
     int i=0;
     int j=arr.length-1;
     while(i<j)
     {
         if((arr[i]+arr[j])==val)
         {
             ArrayList<Integer> list1 = new ArrayList<Integer>();
             list1.add(arr[i]);
             list1.add(arr[j]);
             list.add(list1);
             i++;
             j--;
         }
         else if((arr[i]+arr[j])<val)
         {
             i++;
         }
         else
         {
             j--;
         }
     }
     System.out.println(list);
    }
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int arr[] = { 2, 3, 4, -2, 6, 8, 9, 11 }; 
        int val = sc.nextInt();
        findPair(arr,val);
    }
}