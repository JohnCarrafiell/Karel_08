/**
 * A BoxTopRacer is a Racer that can jump over hurdles of any width.
 * 
 * @author <John Carrafiel>
 * @version <...>
 *
 */
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class BoxTopRacer extends Racer {
	
	public BoxTopRacer(int y) {
   
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
      }
      else if(!rightIsClear()&&!frontIsClear()){
      turnLeft();
      }
      
	}

}

