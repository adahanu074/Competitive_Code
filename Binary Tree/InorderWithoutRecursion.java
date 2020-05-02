import java.util.*;
class Node 
{ 
    int key; 
    Node left, right; 
  
    public Node(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
} 
public class InorderWithoutRecursion
{
    Node root;
    // static Node temp;
    public void inorder()
    {
        Stack<Node> stack = new Stack<Node>();
        Node curr = root;
        while(curr !=null || !stack.isEmpty())
        {
            while(curr!=null)
            {
                stack.push(curr);
                curr = curr.left;
                
            }
            curr = stack.pop();
            System.out.print(curr.key);
            curr = curr.right;
        }
    }
    public static void main(String [] args)
    {
        InorderWithoutRecursion tree = new InorderWithoutRecursion(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.inorder(); 
    }
}