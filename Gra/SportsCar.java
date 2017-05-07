import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class SportsCar extends Car
{ 

    // * General options
       
    private int turbo;
    private static int normalSpeed = 4;
    private static int normalTurn = 10;
    private static int grassSpeed = normalSpeed/2;
    
// * Class constructor

    public SportsCar (String file1, int turbo){
        super(file1);
        if (turbo>0){
            setTurbo(turbo);
        } else
            setTurbo(0);
        }
    
    // * Movement Options
         
    public void moveForward(){
    if (Greenfoot.isKeyDown("up"))
            if (isTouching(Grass.class)){
            
            move(grassSpeed);
        }
            else
            move(normalSpeed);
            }
    
    public void moveBackward(){
    if (Greenfoot.isKeyDown("down"))
        move(-normalSpeed);
    }
    
    public void turnRight(){
    if (Greenfoot.isKeyDown("right"))
        turn(normalTurn);
    }
    
    public void turnLeft(){
    if (Greenfoot.isKeyDown("left"))
        turn(-normalTurn);
    }
     
    // * Turbo Options
    
    public void setTurbo(int turbo){
       this.turbo=turbo;
    }
    
    public int getTurbo(){
        return this.turbo;
    }
      
    public void turboBoost(){
    if (Greenfoot.isKeyDown("o"))
        if (isTouching(Grass.class)){
            
        move(grassSpeed + getTurbo());
        }
        else
        move(normalSpeed + getTurbo());
    }
    
    }  
    
       

