import java.lang.System.*;

public class TimeCounter {
    private long startTime;
    private long lastTime;
    private long bestTime;
    private boolean isCounting;

    public TimeCounter() {
        
    }
         
   public void start() {
       startTime = System.currentTimeMillis();
       isCounting = true;
   }
   
   public void stop() {
       lastTime = getTime();
       isCounting = false;
   }
        
   public void restart() {
       checkBestTime();
       start();
   }
   
   public long getTime() {
       return isCounting ? System.currentTimeMillis() - startTime : lastTime;
   }
   
   public long getBestTime() {
       return bestTime;  
   }
    
   private void checkBestTime() {
       if (startTime != 0) { 
           long measuredTime = getTime();
           if (measuredTime < bestTime || bestTime == 0) {
               bestTime = measuredTime;
           }
       }    
   }
}
