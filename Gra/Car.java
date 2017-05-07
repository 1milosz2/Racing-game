import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 General Car definition
 */
public class Car extends Actor
{

// * General options

    private boolean touchedCheckpoint = false;
    private boolean touchedFinishline = false;
    
// * Class constructor
    
    public Car(String file1){
    setImage(file1);
    }
    
// * Methods performed by Cars in the game    
    
    public void act() 
    {
        moveForward();
        moveBackward();
        turnLeft();
        turnRight();
        isTouchingCheckpoint();
        isTouchingFinishline();
    }   

// * Movement Options
    
    public void moveForward(){
    if (Greenfoot.isKeyDown("w"))
        move(2);
    }
    
    public void moveBackward(){
    if (Greenfoot.isKeyDown("s"))
        move(-2);
    }
    
    public void turnRight(){
    if (Greenfoot.isKeyDown("d"))
        turn(2);
    }
    
    public void turnLeft(){
    if (Greenfoot.isKeyDown("a"))
        turn(-2);
    }

// * Clock reset checks

    public void isTouchingCheckpoint(){
    if (isTouching(CheckpointLine.class));
    touchedCheckpoint = true;
    }
    
    public void isTouchingFinishline(){
        if (isTouching(FinishLine.class));
        touchedFinishline = true;
    }
    
}
