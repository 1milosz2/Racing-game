import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    public Car(String file1){
    setImage(file1);
}
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
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
