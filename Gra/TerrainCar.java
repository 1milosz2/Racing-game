import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class TerrainCar extends Car {
    public TerrainCar(String file) {
        super(file);
    }
    
    protected int getSlowSpeed() {
        return 2;
    }
    
    protected int getNormalSpeed() {
        return 2;
    }
    
    protected int getFastSpeed() {
        return 2;
    }
    
    protected int getTurnSpeed() {
        return 1;
    }
}  
    
       

