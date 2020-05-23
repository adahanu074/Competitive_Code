class MaximumXORsubarray
{
    public static void maxSubarrayXOR(int [] set,int n)
    {
        int index=0;
        for(int i=31;i>=0;i--)
        {
            int max = Integer.MIN_VALUE;
            int maxIndex = index;
            for(int j=0;j<n;j++)
            {
                if((set[j] & (1<<i))!=0 && set[j]>max)
                {
                    max= set[j];
                    maxIndex = j;
                }
            }
            if(max==Integer.MIN_VALUE)
            {
                continue;
            }
            
        }
    }
    public static void main(String arg[]) { 
    int set[] = {9, 8, 5}; 
    int n = set.length; 
  
    System.out.print("Max subset XOR is "); 
    System.out.print(maxSubarrayXOR(set, n)); 
} 
}