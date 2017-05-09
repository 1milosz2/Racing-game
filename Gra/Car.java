import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Car extends Actor {
    private CarMode mode;
    
    public Car(String file) {
        setImage(file);
        mode = CarMode.NORMAL;
    }  
    
    public void moveForward() {
        int speed = resolveSpeed();
        move(speed);
    }
    
    public void moveBackward() {
        int speed = -1 * resolveSpeed();
        move(speed);
    }
    
    public void turnRight() {
        int speed = getTurnSpeed();
        turn(speed);
    }
    
    public void turnLeft() {
        int speed = -1 * getTurnSpeed();
        turn(speed);
    }    
    
    public void setMode(CarMode mode) {
        this.mode = mode;
    }
    
    private int resolveSpeed() {
        switch (mode) {
            case SLOW:
                return getSlowSpeed();
            case NORMAL:
                return getNormalSpeed();
            case FAST:
                return getFastSpeed();
            default:
                return getNormalSpeed();
        }
    }
    
    protected abstract int getSlowSpeed();
    
    protected abstract int getNormalSpeed();
    
    protected abstract int getFastSpeed();
    
    protected abstract int getTurnSpeed();
    
    public boolean isTouching(Class c) {
        return super.isTouching(c);
    }
    
    public enum CarMode {
        SLOW,
        NORMAL,
        FAST;
    }
}
