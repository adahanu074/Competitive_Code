import java.util.*;
class Solution55 {
    // public boolean win()
    public static String tictactoe(int[][] moves) {
        int chances = moves.length;
        char result[][] = new char[3][3];
        int flag=0;
        for(int i=0;i<chances;i++)
        {
            if(flag==0)
            {
                result[moves[i][0]][moves[i][1]]='X';
                flag=1;
            }
            else
            {
            result[moves[i][0]][moves[i][1]]='O';
            flag=0;
            }  
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        Map<String,Integer> mapx = new HashMap<>();
        Map<String,Integer> mapo = new HashMap<>();
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(result[i][j]=='X')
                {
                    String rowm = "X placed at"+ i + "row";
                    String colm = "X placed at" + j + "col";
                    if(mapx.containsKey(rowm))
                    {
                        mapx.put(rowm,mapx.get(rowm)+1);
                    }
                    else
                    {
                        mapx.put(rowm,1);
                    }
                    
                    if(mapx.containsKey(colm))
                    {
                        mapx.put(colm,mapx.get(colm)+1);
                    }
                    else
                    {
                        mapx.put(colm,1);
                    }
                }
                else if(result[i][j]=='O')
                {
                    String rowm = "O placed at"+ i + "row";
                    String colm = "O placed at" + j + "col";
                    if(mapo.containsKey(rowm))
                    {
                        mapo.put(rowm,mapo.get(rowm)+1);
                    }
                    else
                    {
                        mapo.put(rowm,1);
                    }
                    
                    if(mapo.containsKey(colm))
                    {
                        mapo.put(colm,mapo.get(colm)+1);
                    }
                    else
                    {
                        mapo.put(colm,1);
                    }
                    
                }
                else
                {
                    continue;
                }
            }
        }
        
        for(Map.Entry<String,Integer> map:mapx.entrySet())
        {
            int value = map.getValue();
            if(value==3)
            {
                return "A";
            }
        }
        
        for(Map.Entry<String,Integer> map:mapo.entrySet())
        {
            int value = map.getValue();
            if(value==3)
            {
                return "B";
            }
        }
        System.out.println(mapx);
        System.out.println(mapo);
        if(result[0][0]== result[1][1] && result[1][1]==result[2][2] )
        {
            boolean vall = result[1][1]==result[2][2];
            boolean val1 = result[0][0]== result[1][1];
            System.out.println("hahahahah" + vall +"  "+val1 );
            if(result[0][0]=='X')
            {
                return "A";
            }
            else if(result[0][0]=='O')
                return "B";
        }
        if(result[0][2] == result[1][1] && result[1][1]==result[2][0])
        {
            System.out.println("noooooo");

            if(result[1][1]=='X')
            {
                return "A";
            }
            else if(result[2][0]=='O')
            return "B";
        }
        if(chances==9)
        {
            return "Draw";
        }
        return "Pending";
    }
    public static void main(String [] args)
    {
        // int arr[][] = {{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}};
        // System.out.println(tictactoe(arr));
        // StringBuilder str =new StringBuilder("");
        // str.append('a');
        // System.out.println(str);
        System.out.println((int)('a') - (int)('A'));
        System.out.println((int)('a'));
        System.out.println((int)('Z'));
        char b = (char)((int)('C')+32);
        System.out.println(b);
    }
}