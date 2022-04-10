
public class MobileSprite extends Sprite
{
    private double vx,vy;
    public MobileSprite()
    {
        super(0,0,0,0,null);
        vx=0;
        vy=0;
    }
    public MobileSprite(double x1,double y1, double x, double y, int width, int height, String image)
    {
        super(x,y,width,height,image);
        vx=x1;
        vy=y1;
    }
    public void setVX(double v)
    {
        vx=v;
    }
    public void setVY(double v)
    {
        vy=v;
    }
    public double getVX()
    {
        return vx;
    }
    public double getVY()
    {
        return vy;
    }
    public void step(World world)
    {
        setX(getX()+vx);
        setY(getY()+vy);
    }
}
