
public class BouncingSprite extends MobileSprite
{
    public BouncingSprite(double v, double v2, double x, double y, int width, int height, String image)
    {
        super(v,v2,x,y,width,height,image);
    }
    private void bounce()
    {
        if(getX()<=100||getX()>=500||getY()<=100||getX()>=500)
        {
            setVX(-(getVX()));
            setVY(-(getVY()));
        }
    }
    public void step(World w)
    {
        super.step(w);
        bounce();
    }
}
