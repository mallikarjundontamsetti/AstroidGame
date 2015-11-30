import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{

    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        //Add the player and 4 rocks
        
        
        addObject(new Rocket(),300,350);
        addObject(new Rock(),100,100);
        addObject(new Rock(),600,200);
        addObject(new Rock(),400,300);
        addObject(new Rock(),200,100);
        setPaintOrder(Rocket.class,Rock.class,Laser.class);
        
          
        addObject(new Counter("Score: "), 60, 380);
    }
}
