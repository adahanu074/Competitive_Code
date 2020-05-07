class SegmentTree
{
    static int n;
    static int tree[] = new int[24];
    public static void build(int arr[])
    {
        
        for(int i=0;i<n;i++)
        {
            // System.out.println(n+i + "    "+ i);
            tree[n+i]=arr[i];
        }
        for(int i=n-1;i>0;--i)
        {
            tree[i]=tree[i<<1]+tree[i<<1|1];
        }
    }
// 11110
// 2+4+8+16
    public static void updateTreeNode(int index, int value)
    {
        int real_index = n+index;
        tree[real_index]=value;
        for(int i=real_index;i>1;i--)
        {
            tree[i>>1] = tree[i]+tree[i^1];
        }
    }

    public static int query(int start, int end)
    {
        int l,r;
        int res = 0;
        // 13
        // 14
        for(l=n+start,r=n+end;l<r;l>>=1,r>>=1)
        {
            if((l&1)>0)
            {
                res+=tree[l++];
            }
            if((r&1)>0)
            {
                res += tree[r--];
            }
        }
        return res;
    }
    public static void main(String [] args)
    {
        int []a = {1, 2, 3, 4, 5, 6, 7, 8, 
                                9, 10, 11, 12}; 
      
                                for(int i=0;i<2*n;i++)
                                {
                                    System.out.print(tree[i]+"  ");
                                }
                                // n is global 
        n = a.length; 
          
        // build tree  
        build(a); 
          
        // print the sum in range(1,2) 
        // index-based 
        System.out.println(query(1, 4)); 
          
        // modify element at 2nd index 
        updateTreeNode(2, 1); 
          
        // print the sum in range(1,2) 
        // index-based 
        System.out.println(query(1, 3));
        // for(int i=0;i<2*n;i++)
        // {
        //     System.out.print(tree[i]+"  ");
        // }
    }
}