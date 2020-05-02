class PostFromInPre
{
    static class INT{
        int data;
        INT(int data)
        {
            this.data = data;
        }
    }
    public static void postOrder(int preorder[], int n, int minval, int maxval, INT index)
    {
        if(index.data==n)
        {
            return;
        }
        if(preorder[index.data]<minval || preorder[index.data]>maxval)
        {
            return;
        }
        int val = preorder[index.data];
        index.data++;
        postOrder(preorder,n,minval,val,index);
        postOrder(preorder,n,val,maxval,index);
        System.out.println(val+"  ");
    }
    public static void findPostOrder(int preorder[] , int n)
    {
        INT preindex = new INT(0);

        postOrder(preorder,n, Integer.MIN_VALUE,Integer.MAX_VALUE,preindex);
    }
    public static void main(String [] args)
    {
        int pre[] = { 40, 30, 35, 80, 100 };  
  
    int n = pre.length;  
  
    // Calling function  
    findPostOrder(pre, n);
    }
}