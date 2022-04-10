import java.awt.event.KeyEvent;
/**
 * Write a description of class ControllableSprite here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ControllableSprite extends MobileSprite
{
    public ControllableSprite(double v, double v2, double x, double y, int width, int height, String image)
    {
        super(v,v2,x,y,width,height,image);
    }
    private void keyPress()
    {
        if(StdDraw.isKeyPressed(KeyEvent.VK_UP)&&getY()<=500)
        {
            setY(getY()+20);
        }
        if(StdDraw.isKeyPressed(KeyEvent.VK_DOWN)&&getY()>=20)
        {
            setY(getY()-20);
        }
        if(StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)&&getX()<=500)
        {
            setX(getX()+20);
        }
        if(StdDraw.isKeyPressed(KeyEvent.VK_LEFT)&&getX()>=20)
        {
            setX(getX()-20);
        }
    }
    public void step(World w)
    {
        super.step(w);
        keyPress();
    }
}
