class Node
{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right = null;
    }
}
class Index
{
    int index = 0;
}
class ConstructBST
{
    Index index = new Index();
    public void printInorder(Node root)
{
    if(root==null)
    {
        return;
    }
    printInorder(root.left);
    System.out.println(root.data);
    printInorder(root.right);
}
public Node constructTreeUtil(int pre[],Index preindex , int start, int end, int size)
{
    if(preindex.index>end || start>end)
    {
        return null;
    }
    Node root = new Node(pre[preindex.index]);
    preindex.index = preindex.index+1;
    if(start==end)
    {
        return root;
    }
    int i;
    for(i=start;i<=end;i++)
    {
        if(pre[i]>root.data)
        {
            break;
        }
    }
    root.left = constructTreeUtil(pre,preindex,preindex.index,i-1,size);
    root.right = constructTreeUtil(pre,preindex,i,end,size);
    return root;
}
public Node constructTree(int pre[] , int size)
{
    return constructTreeUtil(pre,index,0,size-1,size);
}
    public static void main(String[] args) { 
        ConstructBST tree = new ConstructBST(); 
        int pre[] = new int[]{10, 5, 1, 7, 40, 50}; 
        int size = pre.length; 
        Node root = tree.constructTree(pre, size); 
        System.out.println("Inorder traversal of the constructed tree is "); 
        tree.printInorder(root); 
    } 
}