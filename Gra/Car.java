import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 General Car definition
 */
public class Car extends Actor
{
    /**
     * Constructor
     */    
    public Car(String file1){
    setImage(file1);
}
    /**
     * Actors
     */
    public void act() 
    {
        moveForward();
        moveBackward();
        turnLeft();
        turnRight();
    }   
           
    public void moveForward(){
    if (Greenfoot.isKeyDown("w"))
        move(2);
    }
    
    public void moveBackward(){
    if (Greenfoot.isKeyDown("s"))
        move(-2);
    }
    
    public void turnLeft(){
    if (Greenfoot.isKeyDown("a"))
        turn(-2);
    }
    public void turnRight(){
    if (Greenfoot.isKeyDown("d"))
        turn(2);
    }
    
 
}
