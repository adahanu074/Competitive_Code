class LargestRegion
{
    public static int largestRegion(int arr[][],int start,int end,int row,int col)
    {
        if(start<0 || end<0 || start>=row || end>=col || arr[start][end]==0)
        {
            return 0;
        }
        arr[start][end]=0;
        int size = 1;
        for(int i=start-1;i<=start+1;i++)
        {
            for(int j=col-1;j<=col+1;j++)
            {
                if(i!=start || j!=end)
                {
                    size +=largestRegion(arr,i,j,row,col);
                }
            }
        }
        // arr[start][end]=1;
        return size;
    }
    public static void main(String args[]) 
{ 
        int M[][] = { {0, 0, 1, 1, 0},  
                      {1, 0, 1, 1, 0},  
                      {0, 1, 0, 0, 0},  
                      {0, 0, 0, 0, 1}};  
        int row = 4;
        int col = 5;
        int max = 0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(M[i][j]==1)
                {
                    int value = largestRegion(M,i,j,row,col);
                    max = Math.max(value,max);
                }
            }
        }
        System.out.println(max);
} 
}