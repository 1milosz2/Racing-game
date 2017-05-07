import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class TerrainCar extends Car
{ 
    
    // * General options
    
    private int turbo;
    private static int normalSpeed = 2;
    private static int normalTurn = 5;
    
    // * Class constructor
    
    public TerrainCar (String file1){
    super(file1);
    }
    
    // * Movement Options
          
    public void moveForward(){
    if (Greenfoot.isKeyDown("w"))
        move(normalSpeed);
    }
    
    public void moveBackward(){
    if (Greenfoot.isKeyDown("s"))
        move(-normalSpeed);
    }
    
    public void turnRight(){
    if (Greenfoot.isKeyDown("d"))
        turn(normalTurn);
    }
    
    public void turnLeft(){
    if (Greenfoot.isKeyDown("a"))
        turn(-normalTurn);
    }
  
    // Turbo options - This car has no turbo but moves with same speed on grass
    
    }  
    
       

