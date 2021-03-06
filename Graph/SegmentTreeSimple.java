class SegmentTreeSimple
{
    static int n;
    static int N = 100000;
    static int tree[] = new int[2*N];
    public static void build(int arr[])
    {
        for(int i=0;i<n;i++)
        {
            tree[n+i]=arr[i];
        }

        for(int i=n-1;i>0;i--)
        {
            tree[i]= tree[i<<1]+tree[i<<1|1];
        }
    }

    public static void updateTreeNode(int p,int value)
    {
        tree[p+n]=value;
        p=p+n;

        for(int i=p;i>1;i>>=1)
        {
            tree[i>>1]= tree[i]+tree[i^1];
        }
    }

    public static int query(int l,int r)
    {
        int res = 0;
        for(l+=n,r+=n;l<r;l>>=1,r>>=1)
        {
            if((l&1)>0)
            {
                res+=tree[l++];
            }
            if((r&1)>0)
            {
                res+=tree[--r];
            }
        }
        return res;
    }
    static public void main (String[] args) 
    { 
        int []a = {1, 2, 3, 4, 5, 6, 7, 8, 
                                9, 10, 11, 12}; 
      
        // n is global 
        n = a.length; 
          
        // build tree  
        build(a); 
          
        // print the sum in range(1,2) 
        // index-based 
        System.out.println(query(1, 3)); 
          
        // modify element at 2nd index 
        updateTreeNode(2, 1); 
          
        // print the sum in range(1,2) 
        // index-based 
        System.out.println(query(1, 3));  
    } 
}