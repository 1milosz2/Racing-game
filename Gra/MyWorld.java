import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.String.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(746, 571, 1); 
        setBackground("racingTrack.jpg");
        populateWorld();
        }
    
    public void populateWorld(){
        Car JKS = new Car("car1.png");
        Car JKS2 = new Car("car1.png");
        addObject(JKS, 300, 215);
        // addObject(JKS2, 300, 255);
    }
}
