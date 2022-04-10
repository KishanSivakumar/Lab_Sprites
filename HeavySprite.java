

public class HeavySprite extends BouncingSprite
{
    public HeavySprite(double v, double v2, double x, double y, int width, int height, String image)
    {
        super(v,v2,x,y,width,height,image);
    }
    public void step(World w)
    {
        super.step(w);
        setY(getY()-0.1);
    }
}
