import greenfoot.*;

public class CarTimeCounter {
    private Car car;
    private TimeCounter counter;
    
    private Class checkpointLineClass;
    private Class finishLineClass;
    
    private boolean checkpointRached;
    
    public CarTimeCounter(Car car, Class checkpointLineClass, Class finishLineClass) {
        this.car = car;
        this.checkpointLineClass = checkpointLineClass;
        this.finishLineClass = finishLineClass;
        counter = new TimeCounter();
        checkpointRached = false;
        
    }
    
    public void update() {
        if (car.isTouching(checkpointLineClass)) {
            checkpointRached = true;
        }
        if (checkpointRached && car.isTouching(finishLineClass)) {
            counter.restart();
            checkpointRached = false;
        }
    }
    
    public void start() {
        counter.start();
    }
    
    public void stop() {
        counter.stop();
    }
    
    public TimeCounter getCounter() {
        return counter;
    }
}
