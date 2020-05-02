import java.util.*;
class PostOrderFromInorderPreorder
{
    public static int search(int inorder[],int value, int n)
    {
        for(int i=0;i<n;i++)
        {
            if(inorder[i]==value)
            {
                return i;
            }
        }
        return -1;
    }
    public static void printPostOrder(int inorder[],int preorder[] , int n)
    {
        int root  = search(inorder,preorder[0],n);
        if(root!=0)
        {
            printPostOrder(inorder,Arrays.copyOfRange(preorder,1,n),root);
        }
        if(root!=(n-1))
        {
            printPostOrder(Arrays.copyOfRange(inorder,root+1,n),Arrays.copyOfRange(preorder,1+root,n),n-root-1);
        }
        System.out.println(preorder[0]);
    }
    
    public static void main(String [] args)
    {
        int inorder[] = { 4, 2, 5, 1, 3, 6 }; 
        int preorder[] = { 1, 2, 4, 5, 3, 6 };
        int n = inorder.length;
        System.out.println("Postorder traversal " );
        printPostOrder(inorder,preorder,n);
    }
}