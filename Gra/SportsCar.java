import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class SportsCar extends Car
{ 
    private int turbo;
    
    /**
     * Constructor
     */
        public SportsCar (String file1, int turbo){
        super(file1);
        if (turbo>0){
            setTurbo(turbo);
        } else
            setTurbo(0);
        }
    
        /**
         * Overriding movement methods
         */
    
        public void moveForward(){
    if (Greenfoot.isKeyDown("up"))
        move(2 + getTurbo());
    }
    
    public void moveBackward(){
    if (Greenfoot.isKeyDown("down"))
        move(-2);
    }
    
    public void turnLeft(){
    if (Greenfoot.isKeyDown("left"))
        turn(-2);
    }
    
    public void turnRight(){
    if (Greenfoot.isKeyDown("right"))
        turn(2);
    }
    
        public void setTurbo(int turbo){
           this.turbo=turbo;
        }
    
    public int getTurbo(){
        return this.turbo;
    }
    }  
    
       

