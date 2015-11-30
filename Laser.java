import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
     public Laser(){
         GreenfootImage image = getImage();
         image.scale(image.getWidth()/5, image.getHeight()/5);
         setImage(image);
        }
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         move(12);
         int x=getX();
         int y=getY();
         if(getWorld() != null &&((x>590)||(x<10)||(y>390)||(y<10))){
             getWorld().removeObject(this);
         }
         
    }    
}
