import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class SportsCar extends Car { 
    public SportsCar(String file) {
        super(file);
    }
    
    protected int getSlowSpeed() {
        return 1;
    }
    
    protected int getNormalSpeed() {
        return 2;
    }
    
    protected int getFastSpeed() {
        return 3;
    }
    
    protected int getTurnSpeed() {
        return 1;
    }
}  
    
       

