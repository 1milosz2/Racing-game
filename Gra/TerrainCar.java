import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class TerrainCar extends Car
{ 
    private int turbo;
    
    /**
     * Constructor
     */
        public TerrainCar (String file1){
        super(file1);
    }
    
        /**
         * Overriding movement methods
         */
        
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
    
       

