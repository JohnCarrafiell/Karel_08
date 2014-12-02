/**
 * A SteepleChaseRacer is a Racer that can jump over hurdles of any height.
 * 
 * @author <...>
 * @version <...>
 *
 */
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class SteepleChaseRacer extends Racer {
	
   public SteepleChaseRacer(int y) {
   
   super(y);
   }
   
	@Override
	public void jumpRight() {
	
   if (!rightIsClear()&&frontIsClear()){
      move();
      }
      else if(rightIsClear()&&frontIsClear()){
      turnRight();
      move();
      turnRight();
      move();
      }
      else if(!rightIsClear()&&!frontIsClear()){
      turnLeft();
      }
      
	}

}

