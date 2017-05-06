import greenfoot.*;
import java.lang.Object.*;
import java.lang.System.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Best Time Counter
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private static long startTime = System.currentTimeMillis();   
    private Color color1;
    private Color color2;
    
    public void act() 
    {
      update(getLapTime());
    }
        
    public long getLapTime() {
        long nowMillis = System.currentTimeMillis();
        return (long)((nowMillis - this.startTime) / 1000);
    }    
    
    public void resetCounter(){
        startTime = System.currentTimeMillis();
    }

    /**
     * Constructor
     */    
    public Counter(Color color1, Color color2){
        setColor1(color1);
        setColor2(color2);
        update(getLapTime());
    }
    
    public void update(long durationSecs){
        setImage(new GreenfootImage("Current lap time " + durationSecs, 20, getColor1(), getColor2()));
    }

    public void setColor1(Color color1){
        this.color1 = color1;
    }
    
    public Color getColor1(){
        return this.color1;
    }   

    public void setColor2(Color color2){
        this.color2 = color2;
    }
    
    public Color getColor2(){
        return this.color2;
    } 
}

