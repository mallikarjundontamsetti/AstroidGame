import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.Random;
/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    int speed = 0;
    public Rocket(){
        super();
        setRotation(-90);
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("right")){turn(5);}
        if(Greenfoot.isKeyDown("left")){turn(-5);}
        if(Greenfoot.isKeyDown("space")){fire();}
        if(Greenfoot.isKeyDown("up")){
            speed = (2 +speed);
            if(speed>10){speed =10;}
        }
        move(speed);
        if(speed>1){speed -=1;}
        else{speed = 0;}
        
        if(getOneIntersectingObject(Rock.class) != null){
            
            World world = getWorld(); 
            world.removeObjects(world.getObjects(null));
            world.setBackground("game_over.jpg");
            Greenfoot.stop();
        }
    }   
     private void fire(){
         int x=getX();
         int y=getY();
         Laser laser = new Laser();
         laser.setRotation(getRotation());
         World space = getWorld();
         space.addObject(laser,x,y);
         
         List<Rock> lst = getWorld().getObjects(Rock.class);

         if( lst == null || lst.size() == 0 ){
             creatNewRocks();
        }
        }
        
     private void creatNewRocks(){
         Random randomGenerator = new Random();
         
         for(int i=0;i<2;i++){
             int size = 20 + randomGenerator.nextInt(300);
             int y = (size/2 +size) > 400? size/2 :(size/2 +size);
             getWorld().addObject(new Rock(), size, y);
        }
     }
}
    
   
