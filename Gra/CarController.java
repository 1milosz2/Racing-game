import greenfoot.*;

public class CarController {
    private Car car;
    
    private String upKey;
    private String downKey;
    private String rightKey;
    private String leftKey;
    private String turboKey;
    
    private Class highSpeedAreaClass;

    public CarController(Car car, 
        String upKey, String downKey, String rightKey, String leftKey, String turboKey,
        Class highSpeedAreaClass) {
        this.car = car;
        this.upKey = upKey;
        this.downKey = downKey;
        this.rightKey = rightKey;
        this.leftKey = leftKey;
        this.turboKey = turboKey;
        this.highSpeedAreaClass = highSpeedAreaClass;
    }

    public void control() {
        if (Greenfoot.isKeyDown(upKey)) {
            car.moveForward();
        }
        if (Greenfoot.isKeyDown(downKey)) {
            car.moveBackward();
        }
        if (Greenfoot.isKeyDown(rightKey)) {
            car.turnRight();
        }
        if (Greenfoot.isKeyDown(leftKey)) {
            car.turnLeft();
        }
        if (!car.isTouching(highSpeedAreaClass)) {
            car.setMode(Car.CarMode.SLOW);
        } else {
            if (Greenfoot.isKeyDown(turboKey)) {
                car.setMode(Car.CarMode.FAST);
            } else {
                car.setMode(Car.CarMode.NORMAL);
            }
        }
    }
}
