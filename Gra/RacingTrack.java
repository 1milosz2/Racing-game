import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class RacingTrack extends World {
    private Car sportsCar;
    private Car terrainCar;
    
    private CarController sportsCarController;
    private CarController terrainCarController;
    
    private CarTimeCounter sportsCarTimeCounter;
    private CarTimeCounter terrainCarTimeCounter;
    
    private Actor grass;
    private Actor asphalt;
    private Actor checkpointLine;
    private Actor finishLine;
    private Actor speedRetarder;
    
    public RacingTrack() {   
        super(746, 571, 1);   
        sportsCar = new SportsCar("SportsCar.png");
        terrainCar = new TerrainCar("TerrainCar.png");
        
        sportsCarController = new CarController(sportsCar,
            "up", "down", "right", "left", "p",
            Asphalt.class);
        terrainCarController = new CarController(terrainCar,
            "w", "s", "d", "a", "v",
            Asphalt.class);
            
        sportsCarTimeCounter = new CarTimeCounter(sportsCar,
            CheckpointLine.class, FinishLine.class);
        terrainCarTimeCounter = new CarTimeCounter(terrainCar,
            CheckpointLine.class, FinishLine.class);
        
        grass = new Grass("grass.png");
        asphalt = new Asphalt("asphalt.png");
        checkpointLine = new CheckpointLine("checkpointLine.png");
        finishLine = new FinishLine("finishline.png");
        speedRetarder = new SpeedRetarder("speedRetarder.png");
        
        draw();
    }
   
    private void draw() {
        // setBackground("racingTrack.jpg");
        addObject(grass,373,286);
        addObject(asphalt,373,286);
        addObject(finishLine,370,470);
        addObject(checkpointLine, 425, 230);
        addObject(speedRetarder,450,300);
        addObject(terrainCar, 400, 450);
        addObject(sportsCar, 400, 550);
    }
    
    @Override
    public void started() {
        sportsCarTimeCounter.start();
        terrainCarTimeCounter.start();
    }
    
    @Override
    public void stopped() {
        sportsCarTimeCounter.stop();
        terrainCarTimeCounter.stop();
    }
    
    @Override
    public void act() {
        sportsCarController.control();
        terrainCarController.control();
        sportsCarTimeCounter.update();
        terrainCarTimeCounter.update();
        displayStats("Sporty", 400, 20, sportsCarTimeCounter.getCounter()); 
        displayStats("RedNeck!", 400, 40, terrainCarTimeCounter.getCounter()); 
    }
    
    private void displayStats(String playerName, int x, int y, TimeCounter counter) {
        String stats = playerName 
            + " - time: " + counter.getTime() 
            + "; best time: " + counter.getBestTime();
        showText(stats, x, y);
    }
}
