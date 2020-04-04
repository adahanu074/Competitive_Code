import java.util.*;
class Move
{
    int x;
    int y;
    int pos;
    public Move(int x,int y,int pos)
    {
        this.x=x;
        this.y=y;
        this.pos=pos;
    }
    public void setx(int x)
    {
        this.x=x;
    }
    public int getx()
    {
        return this.x;
    }
    public void sety(int y)
    {
        this.y=y;
    }
    public int gety()
    {
        return this.y;
    }
    public void setpos(int pos)
    {
        this.pos=pos;
    }
    public int getpos()
    {
        return this.pos;
    }
}
public class RobotMove
{
    public static void main(String [] args)
    {
        Move bot = new Move(0,0,1);
        Scanner sc =new Scanner(System.in);
        String str =sc.next();
        //GLGLGLG
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='G')
            {
            if(bot.getpos()==1)
            {
                bot.sety(bot.gety()+1);
                bot.setx(bot.getx());
            }
            else if(bot.getpos()==2)
            {
                bot.setx(bot.getx()+1);
                bot.sety(bot.gety());
            }
            else if(bot.getpos()==3)
            {
                bot.sety(bot.gety()-1);
                bot.setx(bot.getx());
            }
            else
            {
                bot.setx(bot.getx()-1);
                bot.sety(bot.gety());
            }
        }
        else if (str.charAt(i)=='L')
        {
            bot.setpos((bot.getpos()+3)%4);
        }
        else{
            bot.setpos((bot.getpos()+1)%4);
        }
        }

        if(bot.getx()==0 && bot.gety()==0)
        {
            System.out.println("circular");
        }
        else
        {
            System.out.println(" not circular");
        }
    }
}