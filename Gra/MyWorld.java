import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.String.*;

public class MyWorld extends World
{
    
    // * Class constructor for MY WORLD
        
    public MyWorld()
    {    
        // Creates a new world with 746x571 cells with a cell size of 1x1 pixels.
        // Set racingTrack.jpg as background.
        
        super(746, 571, 1); 
        setBackground("racingTrack.jpg");
        populateWorld();
        
        }
    
    // * Method that summons ALL objects into the world
        
    public void populateWorld(){
        
        // * Definitions of new objects from the classes
        
        // * Definitions of new cars        
        Car TerrainCar = new TerrainCar("TerrainCar.png");
        Car SportsCar = new SportsCar("SportsCar.png", 4);
        
        // * Definitions of background
        Grass grass = new Grass("grass.png");
        Asphalt asphalt = new Asphalt("asphalt.png");
        
        // * Definitions of reset marks
        CheckpointLine checkpointLine = new CheckpointLine("checkpointLine.png");
        FinishLine finishLine = new FinishLine("finishline.png");
        
        // * Definitions of counter - TO BE ADDED FOR BOTH PLAYERS
        Counter counterPlayer1 = new Counter(Color.BLUE, Color.GREEN);
            
        // * Adding objects
        
        // * Adding background
        addObject(grass,373,286);
        addObject(asphalt,373,286);
        
        // * Adding reset marks
        addObject(finishLine,370,470);
        addObject(checkpointLine, 425, 230);
        
        // * Adding counter - TO BE ADDED FOR BOTH PLAYERS
        addObject(counterPlayer1,600,50);
        // addObject(counterPlayer2,700,500); - SOON TO BE ADDED
        
        // * Adding cars
        addObject(TerrainCar, 400, 450);
        addObject(SportsCar, 400, 490);       
    }
}
