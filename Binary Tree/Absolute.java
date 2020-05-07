import java.util.*;
class Absolute 
{ 
  
    // function to return the maximum number of elements  
    static int maxCount(int n,int a[])  
    {  
        // Counting frequencies of elements  
        HashMap<Integer, Integer> freq = new HashMap<>();  
      
        for(int i = 0; i < n; ++i) 
        {  
            if(freq.containsKey(a[i]))  
                freq.put(a[i], freq.get(a[i]) + 1);  
            else
                freq.put(a[i], 1);  
        }  
      
        // Finding max sum of adjacent indices  
        int ans = 0;  
      
        for (Integer key : freq.keySet())  
        {  
            if(freq.containsKey(key+1))  
                ans = Math.max(ans, freq.get(key) + freq.get(key+1));  
        }  
      
        return ans;  
    }  
  
    // Driver code 
    public static void main(String []args) 
    { 
          
        
        int arr[] = {2, 2, 3, 4, 5,2,3,2};  
        int n = arr.length; 
        // function call to print required answer  
        System.out.println(maxCount(n,arr)); 
    } 
} 
  