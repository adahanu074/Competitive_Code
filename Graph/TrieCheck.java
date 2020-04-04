class TrieCheck
{
    static int alpha = 26;
    static class TrieNode
    {
        static TrieNode childern [] = new TrieNode[alpha];
        boolean islast;
        TrieNode()
        {
            islast = false;
            for(int i=0;i<alpha;i++)
            {
                childern[i]=null;
            } 
        }
    };

    static TrieNode root;
    public static void insert(String str)
    {
        int len = str.length();
        TrieNode check = root;
        for(int i=0;i<len;i++)
        {
            int index = str.charAt(i)-'a';
            if(check.childern[index]==null)
            {
                check.childern[index] = new TrieNode();
            }
            check = check.childern[index];
        }
        check.islast = true;
        
    }

    public static boolean search(String str)
    {
        
        TrieNode check = root;
        for(int i=0;i<str.length();i++)
        {
            int index = str.charAt(i)-'a';
            System.out.println(index);
            if(check.childern[index]==null)
            {
                return false;
            }
            check=check.childern[index];
        }
        System.out.println(check.islast); 
        System.out.println(check!=null);
        return false;
    }

    public static void main(String args[]) 
    { 
    
        String keys[] = {"the", "a", "there", "answer", "any", 
                         "by", "bye", "their"}; 
       
        String output[] = {"Not present in trie", "Present in trie"}; 
       
       
        root = new TrieNode(); 

        for(int i=0;i<keys.length;i++)
        {
            insert(keys[i]);
        }

        boolean val = search("the");
    }
}