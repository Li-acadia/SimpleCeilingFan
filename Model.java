public class Model {
    private int speed;
    private boolean isForward;

    public Model(){
        speed = 0;
        isForward = true;
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int value){
        speed = value;
    }

        
    public boolean getIsForward(){
        return isForward;
    }

    public void setIsForward(Boolean value){
        isForward = value;
    }

    @Override
	public String toString() {
		return String.format("Current State of The Ceiling Fan: Speed %d, %s Direction", speed, (isForward == true) ? "Forward" : "Backward");
	}
}
