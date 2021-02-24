import processing.core.PApplet;

import java.util.HashMap;

public class FourCircle extends PApplet
{
    public static final int WIDTH=650;
    public static final int HEIGHT=490;
    public static int radius=20;
    public static int speed=1;
    public static int no_of_balls=4;
    public static HashMap<Integer,Balls> balls=new HashMap<Integer,Balls>();

    public static void main(String[] args)
    {
           PApplet.main("FourCircle",args);
    }

    @Override
    public void settings()
    {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup()
    {
        ballsinit();
    }

    private void ballsinit()
    {
        for(int i=1;i<=no_of_balls;i++)
        {
            Balls b=new Balls();
            b.setBall_no(i);
            b.setRadius(radius);
            b.setHeight_of_ball(HEIGHT/(no_of_balls+1)*i);
            b.setSpeed_of_ball(i);
            balls.put(i,b);

        }
    }

    @Override
    public void draw()
    {
        FourBalls();
    }

    private void FourBalls()
    {
        for(int i=1;i<=no_of_balls;i++)
        {
            Balls b=new Balls();
            b=balls.get(i);
            drawCircle(b.getSpeed_of_ball()*speed,b.getHeight_of_ball(),b.getRadius());
        }
        speed++;
    }

    public void paintWhite()
    {
        background(255);
    }
    public void  drawCircle(int centreX,int centreY,int radius)
    {
        ellipse(centreX,centreY,radius,radius);
    }
}
