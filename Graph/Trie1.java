public class Trie1 { 
      
    // Alphabet size (# of symbols) 
    static final int ALPHABET_SIZE = 26; 
      
    // trie node 
    static class TrieNode 
    { 
        TrieNode[] children = new TrieNode[ALPHABET_SIZE]; 
       
        // isEndOfWord is true if the node represents 
        // end of a word 
        boolean isEndOfWord; 
          
        TrieNode(){ 
            isEndOfWord = false; 
            for (int i = 0; i < ALPHABET_SIZE; i++) 
                children[i] = null; 
        } 
    }; 
       
    static TrieNode root;  
      
    // If not present, inserts key into trie 
    // If the key is prefix of trie node,  
    // just marks leaf node 
    // static void insert(String key) 
    // { 
    //     int level; 
    //     int length = key.length(); 
    //     int index; 
       
    //     TrieNode pCrawl = root; 
       
    //     for (level = 0; level < length; level++) 
    //     { 
    //         index = key.charAt(level) - 'a'; 
    //         if (pCrawl.children[index] == null) 
    //             pCrawl.children[index] = new TrieNode(); 
       
    //         pCrawl = pCrawl.children[index]; 
    //     } 
       
    //     // mark last node as leaf 
    //     pCrawl.isEndOfWord = true; 
    // } 

    static void insert(String str)
    {
        int len = str.length();
        TrieNode node = root;

        for(int i=0;i<len;i++)
        {
            int index = str.charAt(i)-'a';
                if(node.children[index]==null)
                {
                    node.children[index]=new TrieNode();
                }
                node = node.children[index];
        }
        node.isEndOfWord=true;

    }
    
    static boolean search(String str)
    {
        int len = str.length();

        TrieNode node = root;

        for(int i=0;i<len;i++)
        {
            int index = str.charAt(i)-'a';
            if(node.children[index]==null)
            {
                return false;
            }
            node  = node.children[index];
        }
        if(node!=null && node.isEndOfWord==true)
        {
            return true;
        }
        return false;
    }
       
    // Driver 
    public static void main(String args[]) 
    { 
        // Input keys (use only 'a' through 'z' and lower case) 
        String keys[] = {"the", "a", "there", "answer", "any", 
                         "by", "bye", "their"}; 
       
        String output[] = {"Not present in trie", "Present in trie"}; 
       
       
        root = new TrieNode(); 
       
        // Construct trie 
        int i; 
        for (i = 0; i < keys.length ; i++) 
            insert(keys[i]); 
       
        // Search for different keys 
        if(search("the") == true) 
            System.out.println("the --- " + output[1]); 
        else System.out.println("the --- " + output[0]); 
          
        if(search("these") == true) 
            System.out.println("these --- " + output[1]); 
        else System.out.println("these --- " + output[0]); 
          
        if(search("their") == true) 
            System.out.println("their --- " + output[1]); 
        else System.out.println("their --- " + output[0]); 
          
        if(search("thaw") == true) 
            System.out.println("thaw --- " + output[1]); 
        else System.out.println("thaw --- " + output[0]); 
         
    } 
}