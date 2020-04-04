import java.util.*;
public class MergeSortedArray
{
    public static void merge(int arr1[], int arr2[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i=0;
        int j=0;
        while(i<arr1.length  && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                list.add(arr1[i]);
                i++;
            }
            else
            {
                list.add(arr2[j]);
                j++;
            }
        }
        while(i<arr1.length)
        {
            list.add(arr1[i]);
            i++;
        }
        while(j<arr2.length)
        {
            list.add(arr2[j]);
            j++;
        }
        System.out.println(list);
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1, 3, 5, 7}; 
        int[] arr2 = {2, 4, 6, 8}; 
        merge(arr1,arr2);
    }
}