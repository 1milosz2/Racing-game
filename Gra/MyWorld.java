import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.String.*;

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
        Car JKS2 = new SportsCar("car2.png", 8);
        Counter counterPlayer1 = new Counter(Color.BLUE, Color.GREEN);
        
        addObject(JKS, 300, 215);
        addObject(JKS2, 300, 255);
        addObject(counterPlayer1,600,50);
        // addObject(counterPlayer2,700,500);
    }
}
