import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tamat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tamat extends Actor
{
    /**
     * Act - do whatever the Tamat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        GreenfootImage image = new GreenfootImage("tamat",50,Color.BLACK, null);
        setImage(image);
        Greenfoot.stop();
        
    }
}
