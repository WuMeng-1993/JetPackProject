public class WorkUtil {
  
  private static final String TAG = "WorkUtil";
  
  private int count = 0;
  
  private boolean whetherToCount = true;
  
  public void start() {
  
    new Thread(new Runnable(){
      @Override
      public void run() {
        while(whetherToCount) {
          try {
            Thread.sleep(1000);
            count++;
            Log(TAG,"start: " + count);
          } catch(IOException e) {
          
          }
        }
      }
    }).start;
  
  }
  
  public void pause() {
  
    whetherToCount = false;
  
  }
  
  public void onDestory() {
  
    count = 0;
  
  }
  
}
