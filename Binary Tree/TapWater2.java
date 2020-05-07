[[12,13,1,12],[13,4,13,12],[13,8,10,12],[12,13,12,12],[13,13,13,13]]
class TapWater2 {
    public int trapRainWater(int[][] heightMap) {
        int n = heightMap.length;
        if(n<3)
        {
            return 0;
        }
        else
        {
         int m= heightMap[0].length;
         int lrow[][]= new int[n][m];
         int rrow[][] = new int[n][m];
        int tcol[][] =new int[n][m];
         int bcol[][]= new int[n][m];
         
         for(int i=0;i<n;i++)
         {
             int max = 0;
             for(int j=0;j<m;j++)
             {
                 max= Math.max(max,heightMap[i][j]);
                 lrow[i][j]=max;
             }
         }
            
            for(int i=0;i<n;i++)
            {
                int max =0;
                for(int j=m-1;j>=0;j--)
                {
                    max = Math.max(max,heightMap[i][j]);
                    rrow[i][j]=max;
                }
            }
            for(int j=0;j<m;j++)
            {
               int max = 0;
                for(int i=0;i<n;i++)
                {
                    max = Math.max(max,heightMap[i][j]);
                    tcol[i][j]=max;
                }
            }
            for(int j=0;j<m;j++)
            {
                int max = 0;
                for(int i=n-1;i>=0;i--)
                {
                    max= Math.max(max,heightMap[i][j]);
                    bcol[i][j]=max;
                }
            }
            int result = 0;
            for(int i=1;i<n-1;i++)
            {
                for(int j=1;j<m-1;j++)
                {
                    int min = Math.min(Math.min(lrow[i][j],rrow[i][j]),Math.min(tcol[i][j],bcol[i][j]));
                    if(min>=heightMap[i][j])
                    result = result+(min-heightMap[i][j]);
                }
            }
            return result;
        }
    }
    public static void main(String [] args)
    {
        
    }
}