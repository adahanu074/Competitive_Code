import java.util.*;
class TestClass {
    static double X = 100000007700000049D;
    static int totalPath = 0;
    static int mod = 1000000007; // 1000000007
    static double sum = 1;
    static double val = 0D;
    public static void numberOfPath(long result[][],double X, int startx,int starty,int endx,int endy)
    {
        if(startx>endx || starty>endy)
        {
            return;
        }
        if(startx==endx && starty==endy)
        {
            sum = sum*result[startx][starty];
            if(sum%X!=val)
            {
                totalPath = ((totalPath%mod)+(1%mod))%mod;
                System.out.println("hello");
            }
            sum = sum/(double)(result[startx][starty]);
            System.out.println(sum+"///////");
            return;
        }
        else
        {
            sum=sum*result[startx][starty];
            numberOfPath(result,X,startx+1,starty,endx,endy);
            numberOfPath(result,X,startx,starty+1,endx,endy);
            sum = sum/(double)(result[startx][starty]);
            System.out.println(sum+"*******");
            return;
        }
    }
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m =sc.nextInt();
       long k = sc.nextLong();
       int w =sc.nextInt();
       long arr[][]= new long[(int)(k)][3];
       for(long i=0;i<k;i++)
       {
           for(int j=0;j<3;j++)
           {
               arr[(int)(i)][j]=sc.nextLong();
           }
       }
       long result[][]=new long[n+1][m+1];
       for(int i=0;i<n+1;i++)
       {
           Arrays.fill(result[i],w);
       }
       for(int i =0;i<n+1;i++)
       {
           result[i][0]=0;
       }
       for(int j=0;j<m+1;j++)
       {
           result[0][j]=0;
       }
       for(long i=0;i<k;i++)
       {
               long x=arr[(int)(i)][0]; 
               long y = arr[(int)(i)][1];
               long value = arr[(int)(i)][2];
               result[(int)(x)][(int)(y)] = value;
       }
       long total = 0;
       int startx = 1;
        int starty =1;
        int endx=n;
        int endy=m;
        long sum = 1;
       numberOfPath(result,X,startx,starty,endx,endy);
       System.out.println(totalPath);
    }
}
