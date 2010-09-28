import java.util.Observable;

public class Event extends Observable {

	public boolean started;

	public Event() {
		this.started = false;
	}

	public void start() {
		this.started = true;
		notifyObservers("soy Event");
	}
}
