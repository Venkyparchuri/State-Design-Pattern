
public class PlatesColorContext {
	
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
	public void changeColor() {
		state.addColor();
	}
	

}
