public class QuickSort
{
    
    public int partition(int arr[], int start ,int end)
    {
        int pivot = arr[end];
        int low = (start-1);
        for(int j=start;j<end;j++)
        {
            if(arr[j]<pivot)
            {
                low++;
                int temp =arr[low];
                arr[low]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[low+1];
        arr[low+1]=arr[end];
        arr[end]=temp;

        return low+1;
    }
    public void quicksort(int arr[] , int start ,int end)
    {
        if(start<end)
        {
            int pi = partition(arr,start,end);

            quicksort(arr,start,pi-1);
            quicksort(arr,pi+1,end);
        }
    }
    public static void main(String [] args)
    {
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.quicksort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    }
}