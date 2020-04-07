package ComboLock;

public class ComboLock {

	//keep track if you got first # right before moving onto the next one
	
	int Correct1 = 0;
	
	int Correct2 = 0;
			
	int Correct3 = 0;
	
	int Current1 = 0;
	
	int Current2 = 0;
	
	int Current3 = 0;
	
	int Count = 0;

	public ComboLock(int Secret1, int Secret2, int Secret3) {
		
		Correct1 = Secret1;
		
		Correct2 = Secret2;
		
		Correct3 = Secret3;
	}

	public void reset() {
		Current1 = 0;
		
		Current2 = 0;
		
		Current3 = 0;
	}

	public void turnRight(int ticks) {
		Count++;
		
		if (Count == 1) {
			Current1 = (40 - ticks) % 40;
		}
		
		if (Count == 3) {
			Current3 = (Current2 - ticks + 40) % 40;
		}
	}

	public void turnLeft(int ticks) {
		Count++
		;
		Current2 = (Current1 + ticks) % 40;
	}

	public boolean open() {
		System.out.println(Current1 + " " + Current2 + " " + Current3);
		
		if (Current1 == Correct1 && Current2 == Correct2 && Current3 == Correct3) {
			return true;
		}
		
		else {
			return false;
		}
	}

}