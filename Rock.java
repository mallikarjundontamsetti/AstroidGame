import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.util.List;
/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    int speed = 3;
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(speed);
        
        int x = getX();
        int y = getY();
        
        if(x<=10){x = 589;}
        
        if(x>=590){x = 11;}
        
        if(y <=10){y = 389;}
        
        if(y>=390){y =11;}
        
        setLocation(x,y);
        
        if(getOneIntersectingObject(Laser.class) != null){
           ((Counter)getWorld().getObjects(Counter.class).get(0)).add(1);
            getWorld().removeObject(this);

        }
        
        
    }    
    
    public Rock(){
        Random randomGenerator = new Random();
        int size = 20 + randomGenerator.nextInt(90);
        GreenfootImage image = getImage();
        image.scale(size,size);
        setImage(image);
        setRotation(size);
    }
}
